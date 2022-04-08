import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        System.out.println("Wild Cards Learning...");
        List<Integer> list = List.of(3,4,5,6,7,7,8);
        System.out.println(value(list));
        List<Float> fl = List.of(3f,4f,5f,6f,7.5f,7.5f,8.64f);
        System.out.println(value(fl));
        print(list);
        print(fl);
    }

    public static Double value(List<? extends Number> list){
        double sum = 0.0d;
        for(Number num : list){
            sum = sum + num.doubleValue();
        }
        return sum;
    }

    public static void print(List<?> list){
       
        for(Object num : list){
            System.out.println(num);
        }
    }
}
