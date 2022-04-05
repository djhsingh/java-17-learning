public class CustomException extends Exception{
    public CustomException(String msg){
        super(msg);
        
        System.out.println(msg);
    }
}
