import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeExternal {

        public static void main(String[] args) {
    
        try{
            FileInputStream stream = new FileInputStream(new File("./external.txt"));
            ObjectInputStream op = new ObjectInputStream(stream);
            Employee std = (Employee) op.readObject();
            System.out.println("Student Deexternalized....");
            System.out.println(std.id + std.name + std.branch);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    