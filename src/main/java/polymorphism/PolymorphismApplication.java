package polymorphism;

import java.util.ServiceLoader;

public class PolymorphismApplication {

    public static void main(String[] args) {
        Car car = ServiceLoader.load(Car.class).iterator().next();
        car.brand();
    }
}
