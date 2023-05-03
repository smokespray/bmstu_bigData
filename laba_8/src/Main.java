
public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();

        robot.move(5);

        Store store = new Store();
        Producer producer = new Producer(store);
        Customer customer = new Customer(store, producer);

        producer.start();
        store.start();
        customer.start();
    }
}