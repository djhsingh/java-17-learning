public class SIBANDIIB {
    static int age;
    static String name;
    int id ;
    String gender;
    {
        id = 25;
        name = "Deepak Singh Jangra";
        System.out.println("Inside the IIB 1");
    }
    {
        id = 55;
        gender = "Singh Jangra";
        System.out.println("Inside the IIB 2");
    }
    static {
        age = 45;
        name = "Rahul";
        System.out.println("Inside the static block 1");
    }
    static {
        age = 87;
        name = "Ajay";
        System.out.println("Inside the static block 2 ");
    }
    SIBANDIIB(){
        System.out.println("Constructor...");
    }

    public static void main(String[] args) {
        SIBANDIIB sib = new SIBANDIIB();
        System.out.println(age +name);
        System.out.println(sib.id +sib.gender);
        SIBANDIIB ib = new SIBANDIIB();
        System.out.println(ib.id +ib.gender);
    }
}
