public class Exceptions {
    public static void main(String[] args){
        System.out.println("Learning Exceptions....");
       try{
        String str = null;
        //System.out.println(str.charAt(0));
       // System.out.println(4/0);
        throw new CustomException("getting error....");
       }
       catch(Exception e){
           System.out.println("Exception caught..");
           e.printStackTrace();
       }
       finally{
           System.out.println("Finally block");
           
       }
    }
}
