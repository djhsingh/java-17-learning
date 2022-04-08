import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class CollectionsClass {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.addAll(List.of(4,5,7,2,18,32,42,2));
        System.out.println(integers);
        Collections.swap(integers, 0, 4);
        System.out.println(integers);
        System.out.println(Collections.binarySearch(integers,42));
        System.out.println(Collections.frequency(integers,2));
        Collections.sort(integers);
        System.out.println(integers);
    }
}
