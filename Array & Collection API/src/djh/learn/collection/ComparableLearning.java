import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableLearning {
    public static void main(String[] args) {
        Student std1 = new Student(2,"Ajay");
        Student std2 = new Student(8,"Rahul");
        Student std3 = new Student(18,"Queen");
        Student std4 = new Student(80,"Mahal");
        Student std5 = new Student(4,"Farhan");
        System.out.println(std1);
        System.out.println(std2);
        System.out.println(std1.compareTo(std2));
        List<Student> stds = new ArrayList<>();
        stds.addAll(List.of(std1,std2,std3,std4,std5));
        System.out.println(stds);
        Collections.sort(stds);
        System.out.println(stds);
    }
}
