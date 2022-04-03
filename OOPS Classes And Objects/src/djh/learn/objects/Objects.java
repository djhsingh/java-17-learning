public class Objects{
    int age = 28;
    public static void main(String[] args) {
        Objects obj = new Objects();
        System.out.println(obj.age);
        Vehicle v = new Vehicle();
        v.name="car";
        v.color="red";
        v.start();
        v.breaks();
    }
}