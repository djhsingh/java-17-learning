import java.util.ArrayList;

public class Composition {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList();   
        cars.add(new Car("red", "Maruti", 34));
        cars.add(new Car("green", "BNM", 22));
        cars.add(new Car("white", "SUX", 77));
        cars.add(new Car("gray", "LAM", 99));
        CarShowroom room = new CarShowroom(cars);
        room.cars.forEach(car -> System.out.println(car.color + car.name + car.milage));
     }
}
