import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathProps {
    public static void main(String[] args) {
        Path p1 = Paths.get("./","userFile.txt");
        try{
            Files.createFile(p1);
            System.out.println("File created...");
            System.out.println(p1.getFileName());
            System.out.println(p1.getFileSystem());
            Files.writeString(p1, """
                Welcome to file nio 
                    """);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
