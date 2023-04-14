
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


import java.io.*;


public class laba5_8 {
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
    public static void laba5_8(String fileName)  {
        StringBuilder sb = new StringBuilder();

        File file = new File(fileName);

        try {
            try (BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()))) {
                String s;
                while ((s = in.readLine()) != null) {
                    for (String word:s.split(" ")){
                        if (word.length()>2)sb.append(" ").append(word.toUpperCase());
                        else sb.append(" ").append(word);
                    }
                    sb.append("\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        new File("/home/user/IdeaProjects/laba5/src/Out5_8").mkdirs();
        laba5_8.write("/home/user/IdeaProjects/laba5/src/Out5_8/laba5_8_out.txt",sb.toString());
    }

}