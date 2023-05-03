public class Robot {
    private Leg rightLeg = new Leg();
    private Leg leftLeg = new Leg();

    public void move(int steps) {
        for (int i = 0; i < steps; i++) {
            rightLeg.run();
            leftLeg.run();
        }
    }

    static class Leg implements Runnable{ // Интерфейс Runnable — это задача, которую выполняет поток, то есть код.
        // Интерфейс содержит основной метод run() — в нём и находится точка входа и логика исполняемого потока.
        //Реализовать интерфейс Runnable и метод run().
        //Создать экземпляр Thread и передать в конструктор свой Runnable (экземпляр класса, реализующий этот интерфейс).
        static final String LEFT = "LEFT";
        static final String RIGHT = "RIGHT";
        static int legCount = 0;
        private final Object key = new Object();

        final String leg;

        Leg() {
            if(legCount%2 == 0){
                this.leg = RIGHT;
            } else {
                this.leg = LEFT;
            }
            legCount++;
        }

        @Override
        public void run() {
            synchronized (key) {
                System.out.println(this.leg);
            }
        }
    }
}