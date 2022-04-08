import java.util.ArrayList;

public class GenericsLearning {
    public static void main(String[] args) {
        System.out.println("GenericsLearning...");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(345);//autoboxing
       // list.add(534.4);//compile time error
       Generic<Integer> myInt = new Generic<>();
       myInt.addItem(45);
       myInt.addItem(32);
       //myInt.addItem(435.3); //compile time error
       System.out.println(myInt);
       System.out.println(myInt.getItem());
    }
}
