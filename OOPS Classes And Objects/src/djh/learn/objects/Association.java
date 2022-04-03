import java.util.ArrayList;

public class Association {
    public static void main(String[] args) {
        Laptops lap = new Laptops("HP");
        Laptops lap2 = new Laptops("Dell");
        ArrayList<Laptops> laptops = new ArrayList();
        laptops.add(lap);
        laptops.add(lap2);
        Person person = new Person("Deepak", laptops);
        System.out.println(person.name);
        person.laptops.forEach(lapz -> System.out.println(lapz.name));
    }
}
