import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

    
    @Override
    public int compare(Employee o1, Employee o2) {
        // TODO Auto-generated method stub
        System.out.println("Sorting using Comparator");
        if (o1.age > o2.age) {
            return 1;
        } else if (o1.age < o2.age) {
            return -1;
        } else {
            return 0;
        }
    }
}
