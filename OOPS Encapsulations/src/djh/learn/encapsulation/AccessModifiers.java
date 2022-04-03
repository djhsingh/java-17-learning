import javax.security.auth.Subject;

public class AccessModifiers {
    private String name;
    protected int age;
    double salary;
    public boolean married;
    
    public static void main(String... args){
        AccessModifiers am = new AccessModifiers();
        System.out.println(am.name);
        Student std = new Student("Deepak",34,500.45);
        System.out.println(std);
    }
}
