package day14_abstraction_polymorphism.car;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable{
    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " has Auto Park");

    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + " has Self Drive");

    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " is started");

    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " is driving");

    }

    @Override
    public void fly() {
        System.out.println(getMake() + " " + getModel() + " can not fly");

    }
}
/*
10. Create a Subclass of Car Named 'CydeoCar' that Implements AutoPark, AutoPilot,
and Flyable Interfaces.
 */