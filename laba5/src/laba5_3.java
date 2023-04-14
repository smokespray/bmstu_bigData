
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class laba5_3 {
    public static void main(String[] args) {
        System.out.println("Введите количество пациентов: ");
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            Patient[] patients = new Patient[n];
            Random random = new Random();
            Diagnosis diagnosis;
            for (int i = 0; i < n; i++) {
                switch (random.nextInt(5)) {
                    case (0):
                        diagnosis = Diagnosis.ANOREXIA;
                        break;
                    case (1):
                        diagnosis = Diagnosis.AUTISM;
                        break;
                    case (2):
                        diagnosis = Diagnosis.BRONCHITIS;
                        break;
                    case (3):
                        diagnosis = Diagnosis.MIGRAINE;
                        break;
                    default:
                        diagnosis = null; // diagnosis = Diagnosis.HEADACHE;
                }
                patients[i] = new Patient((char) (random.nextInt(20) + 97) + "", (char) (random.nextInt(20) + 97) + "", (char) (random.nextInt(20) + 97) + "",(char) (random.nextInt(20) + 97) + "",(random.nextInt(1000)), (random.nextInt(1000)), diagnosis);
                System.out.println(patients[i].toString());
            }
            try {
                diagnosePatients(patients, Diagnosis.BRONCHITIS);
                diagnosePatients(patients, Diagnosis.AUTISM);
                diagnosePatients(patients, Diagnosis.ANOREXIA);
                diagnosePatients(patients, Diagnosis.MIGRAINE);
                searchPatients(patients, 200, 500);
            } catch (NullPointerException e) {
                System.out.println("Не может быть пациента без диагноза!");
            }
        } catch (InputMismatchException e){
            System.out.println("Попробуйте указать количество пациентов с помощью цифр!");
        }



    }

    public static ArrayList<Patient> diagnosePatients(Patient[] patients, Diagnosis diagnosis) {
        System.out.println("--------------------------");
        System.out.println("Пациенты с диагнозом - " + diagnosis.name());
        ArrayList<Patient> diagnosedPatients = new ArrayList<>();
        for (Patient patient: patients) {
            if (patient.diagnosis.equals(diagnosis)) {
                diagnosedPatients.add(patient);
                System.out.println(patient.toString());
            }
        }
        return diagnosedPatients;
    }

    public static ArrayList<Patient> searchPatients(Patient[] patients, int start, int end) {
        System.out.println("--------------------------");
        if (start > end) {
            System.out.println("Не корректный диапазон");
            return null;
        }
        System.out.println("Пациенты с номером медецинской карты в диапаззоне  от " + start + " до " + end);
        ArrayList<Patient> searchedPatients = new ArrayList<>();
        for (Patient patient: patients) {
            if (patient.medicalCardNumber > start && patient.medicalCardNumber < end) {
                searchedPatients.add(patient);
                System.out.println(patient.toString());
            }
        }
        return searchedPatients;
    }
}
