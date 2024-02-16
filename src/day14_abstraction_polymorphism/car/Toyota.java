package day14_abstraction_polymorphism.car;

public class Toyota extends Car {
    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " " + getYear() + " is started");

    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " is driving");

    }
}
/*
5. Create a Subclass of Car Named 'Toyota'.
 */