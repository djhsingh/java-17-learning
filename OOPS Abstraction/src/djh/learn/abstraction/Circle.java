import static java.lang.Math.PI;
public class Circle extends Shape {

    int rad;
    @Override
    void area() {
        System.out.println("Area of Circle is "+PI*rad*rad);
    }
    Circle(int rad){
        this.rad = rad;
    }
}
