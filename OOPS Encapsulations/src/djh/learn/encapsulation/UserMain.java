class UserMain{
    public static void main(String... args){
        FirstRecord fr = new FirstRecord("Deepak", 28, 90000);
        System.out.println(fr);
        System.out.println(fr.name());
        System.out.println(fr.toString());
        Employee emp = new Employee("Deepak",46);
        System.out.println(emp);
        emp.printName();
        System.out.println(emp.MARRIED);
        emp.testRecord();
    }
}