import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
public class FunctionalProgramming {
    public static void main(String[] args) {
        System.out.println("Functional Programming....");
        Printable p = () -> System.out.println("Hello");
        p.print();
        Incrementor i = (x) -> {x++;
            System.out.println(x);
        };
        i.increment(5);
        Addable as  = (a,b) ->{return a+b;};
        System.out.println(as.add(4,6));
        ArrayList<Employee> emps = new ArrayList();
        emps.add(new Employee(1,"Deeapk",85000.0d));
        emps.add(new Employee(2,"Ajay",45000.0d));
        emps.add(new Employee(4,"Rahul",15000.0d));
        emps.add(new Employee(3,"Sunil",28000.0d));
        emps.add(new Employee(5,"Raj",2000.0d));
        Comparator<Employee> comp = Comparator.comparing(e -> e.salary);
        Collections.sort(emps,comp);
        emps.forEach(e -> System.out.println(e));
    }
}
