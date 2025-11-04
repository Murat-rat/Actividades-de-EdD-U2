public class App {
    public static void main(String[] args) throws Exception {
        SinglyLinkedList list = new SinglyLinkedList();
        list.print();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        list.print();
        System.out.println("--------------------------");

        SinglyLinkedList listaPares = list.getPares();
        SinglyLinkedList listaImpares = list.getImpares();

        listaPares.print();
        System.out.println("--------------------------");
        listaImpares.print();
    }
}