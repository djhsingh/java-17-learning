public class Abstraction {
    public static void main(String[] args) {
        System.out.println("Learning Abstraction...");
        Shape rect = new Rectangle(3,4);
        rect.area();
        Shape cir = new Circle(7);
        cir.area();
    }
}
