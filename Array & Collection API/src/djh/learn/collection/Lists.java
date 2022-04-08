import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Arrays;
public class Lists {
    public static void main(String[] args) {
        List<String> myList = List.of("banana", "Apple", "Pea");
        System.out.println(myList);
        ArrayList<Integer> myIntegers = new ArrayList<>();
        myIntegers.add(23);
        myIntegers.addAll(Arrays.asList(4,6,1,8,12,46,6));
        System.out.println(myIntegers);
        System.out.println(myIntegers.contains(23));
        System.out.println(myIntegers.indexOf(6));

        ListIterator itr = myIntegers.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}
