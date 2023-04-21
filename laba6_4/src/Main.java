
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> CA = new HashMap<>();
        HashMap<Integer, Integer> CB = new HashMap<>();

        char[] matrix = new char[54];
        int[] matrix1 = new int[9];
        int[] matrix2 = new int[9];

        int kol = 0;
        try(FileReader reader = new FileReader("/home/user/IdeaProjects/laba6_4/src/matrix.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                matrix[kol] = (char)c;
                kol++;
                //System.out.print((char)c);
            }
        } catch (IOException e) {
        }

        int first = 0;
        boolean first_check = false;
        int t = 0;
        int j = 0;
        for (int i = 0; i < 27; i +=3) {
            // matrix1[j] = Integer.parseInt(String.valueOf(matrix[i]));
            matrix1[j] = Integer.parseInt(String.valueOf(String.valueOf(matrix[i]).getBytes()[0]));
            if (matrix1[j] > 0){
                CA.put(matrix1[j], t);
                t = matrix1[j];
                if (!first_check){
                    first = matrix1[j];
                    first_check = true;
                }
            }
            j++;
        }
        CA.replace(first, t);
        System.out.println(CA);

        first = 0;
        first_check = false;
        t = 0;
        j = 0;
        for (int i = 0; i < 27; i +=3) {
            matrix2[j] = Integer.parseInt(String.valueOf(String.valueOf(matrix[i + 27]).getBytes()[0]));
            //matrix1[j] = Integer.parseInt(String.valueOf(String.valueOf(matrix[i]).getBytes()[0]));
            if (matrix2[j] > 0){
                CB.put(matrix2[j], t);
                t = matrix2[j];
                if (!first_check){
                    first = matrix2[j];
                    first_check = true;
                }
            }
            j++;
        }
        CB.replace(first, t);
        System.out.println(CB);

        int[] matrix_S = new int[9];
        int[] matrix_P = new int[9];

        System.out.println("Сумма матриц: ");
        int st = 1;
        for (int i = 0; i < 9; i++) {
            matrix_S[i] = matrix1[i] + matrix2[i];
            System.out.print(matrix_S[i] + " ");

            if (st % 3 == 0 && i != 0){
                System.out.println();
            }

            st++;
        }

        System.out.println("Умножение матриц: ");
        st = 1;
        for (int i = 0; i < 9; i++) {
            matrix_P[i] = matrix1[i] * matrix2[i];
            System.out.print(matrix_P[i] + " ");
            if (st % 3 == 0 && i != 0){
                System.out.println();
            }
            st++;
        }
    }
}