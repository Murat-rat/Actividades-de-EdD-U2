public class Node {
    Trabajo data;
    Node next;

    public Node(Trabajo data) {
        this.data = data;
        this.next = null;//opcional, pero no esta mal ponerlo, ya que por defecto ya es null
    }
}