import java.util.ArrayList;
import java.util.function.DoublePredicate;
import java.util.function.Predicate;

public class PredicateLearn {
    public static void main(String[] args) {

        DoublePredicate dp = (a) ->{
            if(a>15)
            return true;
            else
            return false;
        };

        System.out.println(dp.test(45));
        System.out.println(dp.test(5));
        
        ArrayList<Student> stds = new ArrayList<>();
        stds.add(new Student(4,"Deepak",28));
        stds.add(new Student(5,"Ajay",45));
        stds.add(new Student(3,"Rahul",12));
        stds.add(new Student(2,"Amar",78));
        stds.add(new Student(6,"Sunil",27));
        Predicate<Student> st = s -> s.age < 30;
        stds.stream().filter(st).forEach(s -> System.out.println(s));
    }
}
