import java.util.Arrays;
import java.util.List;
public class ArraysClass {
    public static void main(String[] args) {
        int array[] = {5,4,7,9,1,2,34,54,22};
        for (var i = 0; i < array.length; i++) {
            var each = array[i];
            System.out.println(each);
        }
        System.out.println(Arrays.binarySearch(array, 34));
        System.out.println("Sorted Array...");
        Arrays.sort(array);
        for (var i = 0; i < array.length; i++) {
            var each = array[i];
            System.out.println(each);
        }
        System.out.println("Array to List...");
        Integer[] spam = new Integer[] { 1, 2, 3 };
        List<Integer> list = Arrays.asList(spam);
        for (Integer each : list) {
            System.out.println(each);
        }

      
    }
}
