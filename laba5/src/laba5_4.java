
import java.util.*;

public class laba5_4 {
    public static void main(String[] args) {
        System.out.println("Введите количество клиентов: ");
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Customer[] customers = new Customer[n];
            Random random = new Random();
            try {
                for (int i = 0; i < n; i++) { // bound должен быть положительным
                    customers[i] = new Customer((char) (random.nextInt(-10) + 97) + "", i + "name",
                            i + "fatherName", random.nextInt(100), random.nextInt(100));
                }
                printCustomers(customers);
                printCustomers(inAlphabeticOrder(customers));
                printCustomers(intervalBankNumber(25, 70, customers));
            } catch (IllegalArgumentException e) {
                System.out.println("Ну разве может быть номер кредитки отрицательным?!?!?");
            }

        } catch (InputMismatchException e) {
            System.out.println("Попробуйте указать количество пациентов с помощью цифр!");
        }

    }

    public static Customer[] inAlphabeticOrder(Customer[] customers) {
        List<String> surnames = new ArrayList<>();
        for (Customer value : customers) {
            surnames.add(value.toString());
        }
        Collections.sort(surnames);
        Customer[] sortedCustomers = new Customer[customers.length];
        for (int i = 0; i < customers.length; i++) {
            for (Customer customer : customers) {
                if (surnames.get(i).equals(customer.toString())) {
                    sortedCustomers[i] = customer;
                }
            }
        }
        return sortedCustomers;
    }

    public static Customer[] intervalBankNumber (int start, int end, Customer[] customers) {
        int n = 0;
        for (Customer customer: customers) {
            if (customer.bankNumber >= start && customer.bankNumber <= end) {
                n++;
            }
        }
        Customer[] intervalCustomers = new Customer[n];
        int i = 0;
        for (Customer customer: customers) {
            if (customer.bankNumber >= start && customer.bankNumber <= end) {
                intervalCustomers[i] = customer;
                i++;
            }
        }
        return intervalCustomers;
    }

    public static void printCustomers(Customer[] customers) {
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
        System.out.println("-------------------------------------");
    }
}
