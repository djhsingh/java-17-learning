import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorClass {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Ajay", 30);
        Employee emp2 = new Employee("Rahil", 50);
        Employee emp3 = new Employee("Sahul", 34);
        Employee emp4 = new Employee("RJ", 29);
        Employee emp5 = new Employee("aMIT", 18);
        List<Employee> emps = new ArrayList<>();
        emps.addAll(List.of(emp1,emp2,emp3,emp4,emp5));
        System.out.println(emps);
        Collections.sort(emps, new AgeComparator());
        System.out.println(emps);
    } 
}
