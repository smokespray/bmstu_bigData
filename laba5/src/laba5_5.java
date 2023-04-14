import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class laba5_5 {
    public static String fileToString(String filePath) throws Exception {
        Scanner sc = new Scanner(new File(filePath));
        StringBuilder sb = new StringBuilder();
        String input;
        while (sc.hasNextLine()) {
            input = sc.nextLine();
            sb.append(input);
        }
        return sb.toString();
    }
    public static void main(String[] args) throws Exception {
        StringBuilder str = new StringBuilder();
        FileWriter writer = new FileWriter("/home/user/IdeaProjects/laba5/src/laba5_5_out.txt", false);
        File file = new File("/home/user/IdeaProjects/laba5/src/laba5_5.txt");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        while (line != null) {
            str.append(line).append(" ");
            line = reader.readLine();
        }
        String[] words = str.toString().split(" ");
        for (String word : words) {
            char ch = word.charAt(0);
            if (ch == 'у' || ch == 'е' || ch == 'ы' || ch == 'а' || ch == 'о' || ch == 'я' || ch == 'и'
                    || ch == 'ю' || ch == 'э' || ch == ' ') {
                writer.append(word);
                writer.append("\n");
                writer.flush();
            }
        }
    }


}