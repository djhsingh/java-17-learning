import java.io.File;

public class FileUse {
    public static void main(String[] args) {
        try{
            File file = new File("./myFile.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.lastModified());
        System.out.println(file.exists());
        System.out.println(file.canWrite());
        if(!file.exists()){
            file.createNewFile();
        }
        System.out.println("After creating file....");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.lastModified());
        System.out.println(file.exists());
        System.out.println(file.canWrite());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
