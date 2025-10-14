public class App {
    public static void main(String[] args) throws Exception {
        SinglyLinkedList list = new SinglyLinkedList();
        list.print();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        list.print();

        list.remove(2);
        list.print();

        System.out.println(list.contains(1));
    }
}
