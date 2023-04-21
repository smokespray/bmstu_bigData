import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    /*
    1. Вычислить средние значения тока и напряжения:
   Iavg = (1/n) * sum(I[i])
   Uavg = (1/n)  sum(U[i])

2. Вычислить ковариационную матрицу:
   cov_matrix = [[sum((I[i]-I_avg)(Ij-Iavg)) for j in range(n)],
                 [sum((I[i]-Iavg)(U[j]-U_avg)) for j in range(n)]]

3. Вычислить обратную матрицу от cov_matrix:
   inv_cov_matrix = inverse(cov_matrix)

4. Вычислить коэффициенты a и b уравнения прямой:
   a, b = np.dot(inv_cov_matrix, [sum((I[i]-I_avg)(R-Uavg)) for i in range(n)])

5. Вычислить сопротивление R:
   R = Uavg - b/a
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество измерений: ");
        int n = scanner.nextInt();

        ArrayList<Double> I = new ArrayList<Double>();
        ArrayList<Double> U = new ArrayList<Double>();

        System.out.println("Введите результаты измерений тока:");
        for (int i = 0; i < n; i++) {
            System.out.print("I[" + (i + 1) + "] = ");
            double current = scanner.nextDouble();
            I.add(current);
        }

        System.out.println("Введите результаты измерений напряжения:");
        for (int i = 0; i < n; i++) {
            System.out.print("U[" + (i + 1) + "] = ");
            double voltage = scanner.nextDouble();
            U.add(voltage);
        }

        double sumI = 0;
        double sumU = 0;
        double sumIU = 0;
        double sumI2 = 0;

        for (int i = 0; i < n; i++) {
            sumI += I.get(i);
            sumU += U.get(i);
            sumIU += I.get(i) * U.get(i);
            sumI2 += Math.pow(I.get(i), 2);
        }

        double a = (n * sumIU - sumI * sumU) / (n * sumI2 - Math.pow(sumI, 2));
        double b = (sumU - a * sumI) / n;

        System.out.println("Приближенное значение сопротивления R: " + a);

        ArrayList<Integer> numbers = new ArrayList<>(List.of(2, 4, 6, 8, 10));
        System.out.println(PairwiseSummation.pairwiseSummation(numbers));

        int car = 0;

        ParkingLot parkingLot = new ParkingLot(10);
        /*
        int spotNumber = parkingLot.park(); // занимаем первое свободное место
        System.out.println(spotNumber);
        int spotNumber2 = parkingLot.park(); // занимаем второе свободное место
        System.out.println(spotNumber2);
        int spotNumber3 = parkingLot.park(); // занимаем первое свободное место
        System.out.println(spotNumber3);
        int spotNumber4 = parkingLot.park(); // занимаем второе свободное место
        System.out.println(spotNumber4);
        int spotNumber5 = parkingLot.park(); // занимаем первое свободное место
        System.out.println(spotNumber5);
        int spotNumber6 = parkingLot.park(); // занимаем второе свободное место
        System.out.println(spotNumber6);
        int spotNumber7 = parkingLot.park(); // занимаем первое свободное место
        System.out.println(spotNumber7);
        int spotNumber8 = parkingLot.park(); // занимаем второе свободное место
        System.out.println(spotNumber8);
        int spotNumber9 = parkingLot.park(); // занимаем первое свободное место
        System.out.println(spotNumber9);
        int spotNumber10 = parkingLot.park(); // занимаем второе свободное место
        System.out.println(spotNumber10);
        int spotNumber11 = parkingLot.park(); // занимаем второе свободное место
        System.out.println(spotNumber11);

         */

        for (int i = 1; i <= 11; i++) {
            car = parkingLot.park();
            if (car != -1) {
                System.out.println("Машина припаркована на месте " + car);
            } else {
                System.out.println("На автостоянке нет свободных мест");
            }
        }
/*
        if (spotNumber != -1) {
            System.out.println("Машина припаркована на месте " + spotNumber);
        } else {
            System.out.println("На автостоянке нет свободных мест");
        }

        if (spotNumber11 != -1) {
            System.out.println("Машина припаркована на месте " + spotNumber11);
        } else {
            System.out.println("На автостоянке нет свободных мест");
        }
        boolean success = parkingLot.leave(spotNumber); // освобождаем место
        if (success) {
            System.out.println("Машина покинула место " + spotNumber);
        } else {
            System.out.println("Место " + spotNumber + " уже свободно");
        }

 */
    }


}


