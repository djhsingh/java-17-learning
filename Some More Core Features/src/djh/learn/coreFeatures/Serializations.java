import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializations {
    public static void main(String[] args) {
        Student std = new Student(1,"Deeapk","IT");
        
        System.out.println(std);
        try{
        FileOutputStream stream = new FileOutputStream(new File("./newFile.txt"));
        ObjectOutputStream op = new ObjectOutputStream(stream);
        op.writeObject(std);
        System.out.println("Student serialized....");
        }
        catch(Exception e){
            e.printStackTrace();
        }

        
    }
}
