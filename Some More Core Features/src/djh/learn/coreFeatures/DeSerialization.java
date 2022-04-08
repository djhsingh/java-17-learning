import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialization {
    public static void main(String[] args) {

    try{
        FileInputStream stream = new FileInputStream(new File("./newFile.txt"));
        ObjectInputStream op = new ObjectInputStream(stream);
        Student std = (Student) op.readObject();
        System.out.println("Student Deserialized....");
        System.out.println(std.id + std.name + std.branch);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
