package day14_abstraction_polymorphism.car;

public class Tesla extends Car implements AutoPark, AutoPilot{

    public Tesla(String make, String model, int year, double price, String color) {
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
}
/*
9. Create two Subclasses of Car ('Tesla' and 'Nio') that Implement both AutoPark and AutoPilot Interfaces.
 */