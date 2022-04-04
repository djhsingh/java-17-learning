public class Rectangle extends Shape {

    int len;
    int br;
    @Override
    void area() {
        System.out.println("Area of Rectangle is "+len*br);
    }
    Rectangle(){
        
    }
    Rectangle(int len,int br){
        this.len =len;
        this.br = br;
    }
}
