public class App {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList doubleList = new DoubleLinkedList();

        doubleList.printForward();
        doubleList.add(1);
        doubleList.add(2);
        doubleList.add(3);
        doubleList.add(4);
        doubleList.add(5);

        doubleList.printForward();
        doubleList.printBackward();
        doubleList.remove(2);
        System.out.println("--------------------------");
        doubleList.printForward();
        doubleList.printBackward();
        doubleList.remove(5);
        System.out.println("--------------------------");
        doubleList.printForward();
        doubleList.printBackward();
        doubleList.remove(1);
        System.out.println("--------------------------");
        doubleList.printForward();
        doubleList.printBackward();
    }
}
