public class DoubleLinkedList {
    Node head;
    
    public void add(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;//Guarda el nuevo nodo
        newNode.prev = currentNode;//En el nuevo nodo da referencia al nodo anterior
    }

    public void printForward() {
        if(head == null) {
            System.out.println("La lista está vacía");
        }
        Node currentNode = head;
        while(currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void printBackward() {
        if(head == null) {
            System.out.println("La lista está vacía");
        }
        Node currentNode = head;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        while(currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.prev;
        }
        System.out.println("null");
    }
}
