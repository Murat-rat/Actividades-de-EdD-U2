public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayStack<Integer> myStack = new ArrayStack<>();
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        myStack.print();
        myStack.pop();
        System.out.println("---------------");
        myStack.print();
        System.out.println("---------------");

        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.print();
        myStack.clear();
        System.out.println("---------------");
        myStack.print();
    }
}
