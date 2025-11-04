public interface QueueInterface<T> {
    T poll();
    T peek();
    void offer(T data);
    void print();
    void reverse();
    boolean isEmpty();
}