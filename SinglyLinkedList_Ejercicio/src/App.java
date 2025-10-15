public class App {
    public static void main(String[] args) throws Exception {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);

        System.out.println(list.count(1));
        System.out.println(list.count(3));
        System.out.println("----------------------");
        list.print();
    }
}
