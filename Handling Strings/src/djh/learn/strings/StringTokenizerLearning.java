import java.util.StringTokenizer;

public class StringTokenizerLearning {
    public static void main(String[] args){
        System.out.println("String Tokenizer learning....");
       // StringTokenizer st = new StringTokenizer("my name is deepak");
        StringTokenizer st = new StringTokenizer("my,name is,deepak",",");
        System.out.println(st.countTokens());
        while(st.hasMoreElements()){
            System.out.println(st.nextElement());
        }
    }
}
