public record Employee(String name,int age) {

    public Employee(){
        this("Unknown",100);
    }
    public Employee(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void printName(){
        System.out.println("Employee Name is "+ this.name);
    }
    static boolean MARRIED = false;
    public static void testRecord(){
        System.out.println("Static Method in Record");
    }
}

