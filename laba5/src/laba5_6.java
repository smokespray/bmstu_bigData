import java.io.*;
import java.io.File;
class Block{

    private final String FILENAME_IN;
    private final String FILENAME_OUT;

    public Block(){
        this.FILENAME_IN = "/home/user/IdeaProjects/laba5/src/laba5_6.txt";
        this.FILENAME_OUT = "/home/user/IdeaProjects/laba5/src/laba5_6_out.txt";
    }

    public void ModifyFile(String SubStrIn, String SubStrOut){

        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(FILENAME_IN)));
            FileWriter fw = new FileWriter(new File(FILENAME_OUT));

            String tmp = null;
            String ost = null;
            int len = SubStrIn.length();
            while ((tmp = br.readLine()) != null) {
                int i = tmp.indexOf(SubStrIn);
                if (i != -1) {
                    ost = tmp;
                    while(i!= -1){

                        fw.write(ost.substring(0, i));
                        fw.write(SubStrOut);
                        ost = ost.substring(i + len);
                        i = ost.indexOf(SubStrIn);
                        if(i == -1) fw.write(ost+"\r\n");
                    }
                } else {
                    fw.write(tmp + "\r\n");
                }
            }
            br.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
public class laba5_6 {

    public static void main(String[] args) {

        Block cp = new Block();
        cp.ModifyFile("улица", "ЕЕЕ");

    }
}