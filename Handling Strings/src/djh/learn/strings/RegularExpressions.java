import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*@gmail.com");
        Matcher matcher = pattern.matcher("djhsingh0001@gmail.com");
        System.out.println(matcher.matches());
        boolean pt = Pattern.matches("[a-zA-Z0-9]*.", "telecom");
        System.out.println(pt);
    }
}
