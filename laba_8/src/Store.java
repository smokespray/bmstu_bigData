public class Store extends Thread {
    private static int productCount;

    public void addProduct(int count) {
        productCount += count;
    }

    public boolean sellProduct(int count) {
        if (productCount >= count) {
            productCount -= count;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public  void run() {
            while (true) {
                try {
                    Thread.sleep(1000); // ждем секунду перед проверкой наличия товара на складе
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (productCount == 0) {
                    System.out.println("Товара в магазине нет");
                }
                else {
                    System.out.println("Осталось " + productCount + " единиц(а/ы) товара");
                }

        }
    }
}