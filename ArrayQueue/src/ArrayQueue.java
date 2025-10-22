public class ArrayQueue<T> implements IQueue<T>{

    private Object[] data;
    private int front;// Primero en la fila
    private int rear;// Para saber en qué posición va el siguiente dato
    private int size;// Tamaño de la cola

    public ArrayQueue() {
        this(10);
    }

    public ArrayQueue(int tam) {
        this.data = new Object[tam];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }
    
    @Override
    public T poll() {
        if(isEmpty()) {
            System.out.println("La cola está vaía");
            return null;
        }
        T result = (T) data[front];//Elemento a retirar
        data[front] = null;//Eliminamos el elemento al frente
        front = (front+1)%data.length;//Calculamos el nuevo frente
        size--;//Reducimos el tamaño de la cola
        return result;//Devolvemos el elemento eliminado
    }

    @Override
    public void offer(T element) {
        //Validar si el arreglo está lleno, lo vamos a incrementar
        this.data[rear] = element;//Agragar un nuevo elemento en la posición rear
        this.rear = (rear+1)%data.length;//Cálculo de rear, si llega al final, lo reinicia a 0
        size++;
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
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < size; i++){
            sb.append(data[(front+i)%data.length]);
            sb.append("->");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
    
}
