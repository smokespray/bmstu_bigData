import java.util.Random;

public class Producer extends Thread {
    private Store store;

    private static int productCount;

    public  void shipment(int count) {
        productCount = count;
        store.addProduct(count);
    }

    public Producer(Store store) {
        this.store = store;
    }


    @Override
    public void run() {
        while (true){
            int shipmentCount = new Random().nextInt(1, 11);
            this.shipment(shipmentCount);
            System.out.println("Производитель поставил " + productCount + " товаров на склад магазина");
            try {
                Thread.sleep(3000); // ждем 3 секунды перед следующей поставкой
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}