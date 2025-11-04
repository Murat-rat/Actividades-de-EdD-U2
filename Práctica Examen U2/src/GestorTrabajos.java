public class GestorTrabajos {
    ArrayQueue<Trabajo> colaTrabajos = new ArrayQueue<>();
    ArrayStack<Trabajo> pilaTrabajos = new ArrayStack<>();
    SinglyLinkedList listaTrabajos = new SinglyLinkedList();

    public void add(Trabajo element) {
        colaTrabajos.offer(element);
    }

    public void process(int quantity) {
        while (quantity > 0) {
            pilaTrabajos.push(colaTrabajos.poll());
            quantity--;
        }
    }

    public void commit() {
        for(int i = 0; i <= pilaTrabajos.size(); i++){
            listaTrabajos.add(pilaTrabajos.pop());
        }
    }

    public void rollback(int quantity) {
        while (quantity > 0) {
            pilaTrabajos.push(listaTrabajos.give());
            quantity--;
        }
    }

    public void print() {
        colaTrabajos.print();
        System.out.println("-------------------");
        pilaTrabajos.print();
        System.out.println("-------------------");
        listaTrabajos.print();
    }
}