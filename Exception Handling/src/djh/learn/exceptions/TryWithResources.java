import java.io.File;
import java.io.PrintWriter;

public class TryWithResources {
    public static void main(String[] args){
        System.out.println("Try with Resources...");
        try(PrintWriter pw = new PrintWriter(new File("./newfile.txt"))){
            pw.println("Hello World");
            System.out.println("File Written....");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
