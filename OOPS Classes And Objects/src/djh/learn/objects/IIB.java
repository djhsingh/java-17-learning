public class IIB {
    int id ;
    String name;
    IIB(){
        System.out.println("Constructor");
    }
    {
        id = 25;
        name = "Deepak Singh Jangra";
        System.out.println("Inside the IIB");
    }
    {
        id = 55;
        name = "Singh Jangra";
        System.out.println("Inside the IIB");
    }
    public static void main(String[] args) {
        IIB iib = new IIB();
        System.out.println(iib.id +iib.name);
    }
}
