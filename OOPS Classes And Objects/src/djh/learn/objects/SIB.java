public class SIB {
    static int age;
    static String name;
    static {
        age = 45;
        name = "Rahul";
        System.out.println("Inside the static block");
    }
    static {
        age = 87;
        name = "Ajay";
        System.out.println("Inside the static block");
    }
    SIB(){
        System.out.println("Constructor...");
    }

    public static void main(String[] args) {
        SIB sib = new SIB();
        System.out.println(age +name);
    }
}
