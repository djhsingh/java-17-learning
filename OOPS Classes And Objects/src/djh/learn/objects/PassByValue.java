import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class PassByValue {
    public static void main(String[] args) {
        int sum = add(10,56);
        System.out.println("Sum of two number is "+sum);
        int rev = reverse(4321);
        System.out.println("Reverse of number is "+rev);
        String str = palindrome("kafak");
        System.out.println("Palindrome String is "+str);
        ArrayList list = new ArrayList<>();
        list.add("Ram");
        list.add("Balram");
        list.add(45);
        list.add(new Date());
        thelist(list);
    }

    public static  int add(int a, int b){
        return a+b;
    }
    public static int reverse(int num){
        int rev = 0, rem =0;
        while(num!=0){
            
            rem = num%10;
            rev = rev*10 +rem;
            num = num/10;
        }
        return rev;
    }
    public static String palindrome(String str){
        StringBuilder revStr = new StringBuilder(str).reverse();
        String  actStr= revStr.toString();
        if(actStr.equals(str)){
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
        return actStr;
    }

    public static void thelist(ArrayList list)
    {
        list.forEach(item -> System.out.println(item));
    }
}
