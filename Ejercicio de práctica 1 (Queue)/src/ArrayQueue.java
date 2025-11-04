import java.util.Stack;

public class ArrayQueue<T> implements QueueInterface<T>{
    private Object[] data;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue() {
        this(10);
    }

    public ArrayQueue(int size) {
        this.data = new Object[size];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    @Override
    public void offer(T element) {
        this.data[rear] = element;
        this.rear = (rear + 1) % data.length;
        size++;
    }

    @Override
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        T element;
        for(int i = 0; i < size; i++) {
            element = (T) data[(front + i) % data.length];
            sb.append(element);
            if(size - 1 != i){
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    @Override
    public void reverse() {
        Stack<T> aux = new Stack<>();
        T element;
        for(int i = rear - 1; i >= 0; i--) {
            element = (T) data[(front + i) % data.length];
            aux.add(element);
        }
        for(int i = 0; i < size; i++) {
            data[i] = aux.get(i);
        }
    }

    @Override
    public T peek() {
        if(isEmpty()) {
            System.out.println("La cola está vacía");
            return null;
        }
        return (T) data[front];
    }

    @Override
    public T poll() {
        if(isEmpty()) {
            System.out.println("La cola está vacía");
            return null;
        }
        T result = (T) data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        return result;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
