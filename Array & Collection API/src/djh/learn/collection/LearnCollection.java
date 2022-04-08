import java.util.Collection;
import java.util.Iterator;
import java.util.Arrays;
public class LearnCollection {
    public static void main(String[] args) {
        System.out.println("Learn Collection");
        Collection<String> strings = Arrays.asList("hello","Hai","Bye");
        System.out.println(strings);
        Iterator itr = strings.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
