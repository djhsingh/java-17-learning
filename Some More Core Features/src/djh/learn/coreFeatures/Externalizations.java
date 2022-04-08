import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Externalizations {
    public static void main(String[] args) {

        Employee std = new Employee(1,"Deeapk","IT");
        
        System.out.println(std);
        try{
        FileOutputStream stream = new FileOutputStream(new File("./external.txt"));
        ObjectOutputStream op = new ObjectOutputStream(stream);
        op.writeObject(std);
        System.out.println("Student externalized....");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
