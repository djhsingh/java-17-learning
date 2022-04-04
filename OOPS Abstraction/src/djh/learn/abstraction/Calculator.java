public interface Calculator {
    public static int var1 = 12;
    private void start(){
        System.out.println("Starting the calculator interface.....");
    }
    default void testDefault(){
        this.start();
        System.out.println("Testing the default method");
    }
    static void testStatic(){
        System.out.println("Testing the static method "+var1);
    }
    public abstract int add(int a, int b);
    public abstract int sub(int a, int b);
}
