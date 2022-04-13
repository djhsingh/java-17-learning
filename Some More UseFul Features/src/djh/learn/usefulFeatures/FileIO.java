import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
public class FileIO {
    public static void main(String[] args) throws Exception{
        System.out.println("Leraning fileio...");
        FileWriter fw = new FileWriter(new File("./newFile.txt"));
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("wlecome to java.....17....");
        System.out.println("File written.....");
        bw.close();
    }
}
