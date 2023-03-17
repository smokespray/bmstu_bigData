import java.util.Scanner;

public class laba3_6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите числитель 1: ");
        double ch11 = console.nextDouble();
        System.out.println("Введите знаменатель 1: ");
        double ch12 = console.nextDouble();
        System.out.println("Введите числитель 2: ");
        double ch21 = console.nextDouble();
        System.out.println("Введите знаменатель 2: ");
        double ch22 = console.nextDouble();

        chislo chislos11 = new chislo(ch11);
        chislo chislos12 = new chislo(ch12);
        chislo chislos21 = new chislo(ch21);
        chislo chislos22 = new chislo(ch22);

        eze_drob eze_drob1 = new eze_drob(chislos11, chislos12);
        eze_drob eze_drob2 = new eze_drob(chislos21, chislos22);

        eze_drob1.sloj(eze_drob2);
        eze_drob1.vich(eze_drob2);
        eze_drob1.del(eze_drob2);
        eze_drob1.umnoj(eze_drob2);
    }
}