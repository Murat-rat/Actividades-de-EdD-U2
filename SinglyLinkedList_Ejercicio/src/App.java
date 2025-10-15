public class App {
    public static void main(String[] args) throws Exception {
        SinglyLinkedList list = new SinglyLinkedList();
        list.print();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(7);
        
        list.print();

        list.remove(2);
        list.print();

        System.out.println(list.contains(1));
        System.out.println("--------------------------");
        System.out.println(list.count(1));
        System.out.println(list.count(3));
        System.out.println(list.count(4));
        System.out.println(list.count(7));
    }
}
