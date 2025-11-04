import java.util.Arrays;

public class ArrayStack<T> implements StackInterface<Object> {

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
        addCapacity();
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
        return (T) data[top - 1];
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
        if(isEmpty()){
            System.out.println("No hay elementos en el Stack");
        }
        for (int i = top-1; i >= 0; i--) {
            data[i] = null;
        }
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
        for (int i = top-1; i >= 0; i--) {
            if(data[i] != null){
                System.out.println(data[i]);
            }
        }
    }

    @Override
    public boolean isPalindrome(String text) {
        String textClean = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        ArrayStack<Character> stack = new ArrayStack<>();
        for(int i = 0; i < textClean.length(); i++) {
            stack.push(textClean.charAt(i));
        }

        for(int i = 0; i < textClean.length(); i++) {
            if(textClean.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}