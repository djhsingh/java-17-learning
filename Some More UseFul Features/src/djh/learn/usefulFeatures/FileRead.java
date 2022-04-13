import java.io.BufferedReader;
import java.io.FileReader;
public class FileRead {
    
        public static void main(String[] args) {
            System.out.println("Leraning fileio...");
            try{
                FileReader fr = new FileReader("./newFile.txt");
            BufferedReader br = new BufferedReader(fr);
            String op ="";
            
            while(true){
                String ot = br.readLine();
                if(ot == null){
                    break;
                }
                else{
                    op = ot+ "\n";
                }
            }
           
            System.out.println("File data is --");
            System.out.println(op);
            br.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
        }
    }
    