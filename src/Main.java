class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.....");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println("Car is honking.....");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();   // ✅ works
        car.start();
        car.honk();
    }
}
