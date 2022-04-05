import java.util.StringJoiner;

public class StringJoinerLearning {
    public static void main(String[] args){
        System.out.println("StringJoiner learning....");
        
        StringJoiner sj = new StringJoiner(":");
        sj.add("My data");
        sj.add("is printing");
        sj.add("is scanning");
        System.out.println(sj);
        StringJoiner sj2 = new StringJoiner("?");
        sj2.add("My data2");
        sj2.add("is printing second time");
        sj2.add("is scanning second time");
        System.out.println(sj2);
        System.out.println(sj.merge(sj2));
    }
}
