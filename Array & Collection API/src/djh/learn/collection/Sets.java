import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class Sets {
    public static void main(String[] args) {
        Set mySet = Set.of(4,6,8);
        System.out.println(mySet);
        HashSet<Integer> newSet  = new HashSet<>();
        newSet.add(56);
        newSet.addAll(Arrays.asList(5,9,10));
        System.out.println(newSet);

        HashSet<Integer> even  = new HashSet<>();
        even.addAll(Arrays.asList(2,4,6,8,10,12));
        System.out.println(even);

        Object[] arr = even.toArray();
        for(Object obj:arr){
            System.out.println(obj);
        }

        LinkedHashSet<String> strings  = new LinkedHashSet<>();
        strings.add("Deepak");
        strings.add("Singh");
        strings.add("Jangra");
        System.out.println(strings);
        strings.clear();
        System.out.println(strings);

        TreeSet<Integer> sortedSet  = new TreeSet<>();
        sortedSet.addAll(Arrays.asList(10,4,8,7,3,23,65));
        System.out.println(sortedSet);
    }
}
