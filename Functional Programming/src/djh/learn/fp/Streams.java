import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        
        IntStream str = IntStream.of(13,40,50,26,37,18);
        str.forEach(System.out::println);
        System.out.println("-----------------");
        IntStream itr = IntStream.of(13,40,50,26,37,18).filter(i -> i>30);
        itr.forEach(System.out::println);
        Stream stre = Stream.of("david","andrew","ajit","raj");
        ArrayList<String> list = (ArrayList<String>)stre.collect(Collectors.toList());
       
       System.out.println(list);
    }
}
