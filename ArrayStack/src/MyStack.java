//Contrato --> Para implementar los metodos de una interfaz
public interface MyStack<T> {
    
    void push(T value);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
    void clear();
    void print();
}