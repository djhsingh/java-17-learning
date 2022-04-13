import java.io.FileReader;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;

public class ReadProps {
        public static void main(String[] args) {
            Properties props = new Properties();
            try{
                FileReader wr = new FileReader("./myProps.properties");
                props.load(wr);
                System.out.println("File written...."+props);
                Set<Entry<Object, Object>> set = props.entrySet();
                System.out.println(set);
                set.forEach(st -> System.out.println(st));
               
            }catch(Exception e){
                e.printStackTrace();
            }
    
        }
    }
    