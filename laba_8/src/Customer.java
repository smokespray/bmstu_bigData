import java.util.Random;

public class Customer extends Thread {
    private Store store;

    private Producer producer;

    public Customer(Store store, Producer producer) {
        this.store = store;
        this.producer = producer;
    }

    @Override
    public void run() {
        while (true) {
            int productCount = new Random().nextInt(1,11); // случайное число товара от 1 до 10
            boolean isSold = store.sellProduct(productCount); // покупаем товар из магазина
            if (isSold) {
                System.out.println("Покупатель купил " + productCount + " товаров");
            } else {
                System.out.println("Товара на складе недостаточно, хотели купить " + productCount);
            }
            try {
                Thread.sleep(1000); // ждем 1 секунды перед следующей покупкой
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}