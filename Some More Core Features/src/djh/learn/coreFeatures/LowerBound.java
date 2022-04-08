import java.util.ArrayList;
import java.util.List;

public class LowerBound {
    public static void main(String[] args) {
        System.out.println("Wild Cards Learning...");
        List<Integer> list = List.of(3,4,5,6,7,7,8);
        List bt = List.of(3,4,5,6,7,7,8);
        ArrayList<Byte> byt = new ArrayList(bt);
        List<Number> num = List.of(3f,4f,5f,6f,7.5f,7.5f,8.64f);
        print(list);
     // TODO  print(byt);
    }


    public static void print(List<? super Integer> list){
       
        for(Object num : list){
            System.out.println(num);
        }
    }
}
