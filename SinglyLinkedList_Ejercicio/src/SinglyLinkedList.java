public class SinglyLinkedList {
    private Node head;

    public void add(int data) {
        //Creación de un nodo
        Node newNode = new Node(data);
        //Verificar si la lista está vacía para agregar head
        if(head == null) {
            head = newNode;
            return;
        }
        //En caso de que no esté vacía,
        //Recorremos todos los nodos hasta encontrar el que tiene referecia "next" en null
        Node currentNode = head;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public boolean contains(int data) {
        Node currentNode = head;
        while(currentNode.next != null) {
            if (currentNode.data == data) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public void remove(int data) {
        if(head == null) {
            return;
        }

        if(head.data == data) {
            head = head.next;
        }

        Node currentNode = head;
        while(currentNode.next != null && currentNode.next.data != data) {
            currentNode = currentNode.next;
        }
        if (currentNode.next != null) {
            currentNode.next = currentNode.next.next;
        }
    }

    public void print(){
        Node currentNode = head;
        while (currentNode != null) { 
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public int count(int data) {
        int total = 0;
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data == data) {
                total++;
            }
            currentNode = currentNode.next;
        }
        return total;
    }
}
