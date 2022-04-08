import java.lang.reflect.Field;

public class ReflectionAPI {
    public static void main(String[] args) {
        System.out.print("Reflection API..........");
        Class<Employee> em = Employee.class;
        System.out.println(em);

        Field [] fields = em.getDeclaredFields();
        for(Field num : fields){
            System.out.print(num.getName());
            System.out.println(num.getType());

        }
    }
}
