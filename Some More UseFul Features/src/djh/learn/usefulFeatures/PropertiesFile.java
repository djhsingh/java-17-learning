import java.io.PrintWriter;
import java.util.Properties;

public class PropertiesFile {
    public static void main(String[] args) {
        Properties props = new Properties();
        try{
            PrintWriter wr = new PrintWriter("./myProps.properties");
            props.setProperty("name", "deepak");
            props.setProperty("age", "24");
            props.setProperty("salary", "90000");
            props.store(wr, "Storing info....");
            System.out.println("File written....");
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
