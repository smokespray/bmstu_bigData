

import java.io.*;

public class laba5_7 {

    public static void write(String fileName, String text) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (PrintWriter out = new PrintWriter(file.getAbsoluteFile())) {
                out.print(text);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void laba5_7(String fileName) {
        StringBuilder sb = new StringBuilder();

        File file = new File(fileName);

        try {
            try (BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()))) {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(new StringBuilder(s).reverse().toString());
                    sb.append("\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        new File("/home/user/IdeaProjects/laba5/src/Out5_7").mkdirs();
        laba5_7.write("/home/user/IdeaProjects/laba5/src/Out5_7/laba5_7_out.txt", sb.toString());
    }
}