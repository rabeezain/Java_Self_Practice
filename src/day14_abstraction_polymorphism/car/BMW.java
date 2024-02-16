package day14_abstraction_polymorphism.car;

public class BMW extends Car {

    public BMW(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " is started");

    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " is driving");

    }
}
/*
7. Create a Subclass of Car Named 'BMW'.
 */