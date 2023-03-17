import java.io.IOException;

public class laba3_5 {
    public static void main(String[] args) throws IOException {
        TextFile textFile = new TextFile();
        TextFile.createFile("File1");
        textFile.renameFile("file1.txt");
        textFile.printToFile("testprint ");
        textFile.deleteFile();

    }
}
