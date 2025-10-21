import java.util.Arrays;

public class ArrayStack<T> implements MyStack<Object> {

    private Object[] data;
    private int top;

    public ArrayStack() {
        this(10);
    }

    public ArrayStack(int initialCpacity) {
        this.data = new Object[initialCpacity];

    }

    @Override
    public void push(Object value) {
        this.data[top++] = value;
    }

    @Override
    public T pop() {
        if(isEmpty()){
            System.out.println("No hay elementos en el Stack");
            return null;
        }
        T value = (T) data[--top]; //Obtiene el último elemento del stack
        data[top] = null;
        return value;
    }

    @Override
    public T peek() {
        if(isEmpty()){
            System.out.println("No hay elementos en el Stack");
            return null;
        }
        return (T) data[top];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public void clear() {
        
    }

    public void addCapacity(){
        if(top == data.length) { //Si el arreglo está lleno, vamos a aumentar la capacidad
            int newCap = data.length*2;
            //Vamos a crear un nuevo arreglo y pasarle los datos que están actualmente al nuevo
            data = Arrays.copyOf(data, newCap);
        }
    }

    @Override
    public void print() {
        if(isEmpty()){
            System.out.println("No hay elementos en el Stack");
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }
}
