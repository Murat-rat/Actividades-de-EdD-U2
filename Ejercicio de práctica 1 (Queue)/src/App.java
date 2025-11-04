public class App {
    public static void main(String[] args) throws Exception {
        ArrayQueue<Customer> queue = new ArrayQueue<>();

        queue.offer(new Customer(1, "Beryl"));
        queue.offer(new Customer(2, "J"));
        queue.offer(new Customer(3, "Kakania"));
        queue.offer(new Customer(4, "Matilda"));
        queue.offer(new Customer(5, "Tenant"));
        queue.offer(new Customer(6, "Pickles"));

        queue.print();
        System.out.println("-----------------------------------");
        queue.reverse();
        queue.print();
        System.out.println("-----------------------------------");
        queue.reverse();
        queue.print();
    }
}
