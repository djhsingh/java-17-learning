public class Employee {
    int id;
    String name;
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.id = 23;
        emp.name = "Deepak Singh Jangra";
        if(emp instanceof Employee){
            System.out.println(emp.id + "  "+emp.name);
        }
    }
}
