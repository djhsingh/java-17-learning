import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
public class Pathz {
    public static void main(String[] args) {
        Path p1 = Paths.get("./","newFile.txt");
        Path p2 = Paths.get("./","copyFile.txt");
        try{
            Files.copy(p1, p2,StandardCopyOption.REPLACE_EXISTING);
            System.out.println("file copied.......");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
