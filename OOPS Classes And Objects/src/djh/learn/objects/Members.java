public class Members {
    static int num = 45;
    int age  = 56;
    public static void main(String[] args) {
        System.out.println("Main Method");
        System.out.println(num);
        Members mem = new Members();
        System.out.println(mem.age);
        isStatic();
        mem.nonStatic();
    }
    public void nonStatic(){
        System.out.println("Non static method");
        Members members = new Members();
        System.out.println(num);
        System.out.println(members.age); 
    }
    public static void isStatic(){
        System.out.println("Static method");
        Members mem = new Members();
        System.out.println(num);
        System.out.println(mem.age);
    }
}
