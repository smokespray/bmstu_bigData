import java.util.Random;

public class Vector {
    int n;
    double[] coordinates;

    public Vector(int n) {
        this.n = n;
        coordinates = new double[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            coordinates[i] = Math.round(random.nextDouble()*100 - 50); // округление векторов для удобной проверки
        }
    }

    public Vector(Vector vector) {
        this.n = vector.n;
        coordinates = new double[n];
    }

    public void printVector() {
        for (int i = 0; i < n; i++) {
            System.out.print(coordinates[i]+ " ");
        }
        System.out.println();
        System.out.println("--------------------------------");
    }


}
