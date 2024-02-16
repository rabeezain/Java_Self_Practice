package day14_abstraction_polymorphism.car;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        if (make == null || make.trim().isEmpty()){
            throw new RuntimeException();
        }
        return make;
    }

    public String getModel() {
        if (model == null || model.trim().isEmpty()){
            throw new RuntimeException();
        }
        return model;
    }

    public int getYear() {
        if (year < 1886){ throw new RuntimeException();}
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){ throw new RuntimeException(); }
        else { this.price = price;}
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.equals(" ")){
            throw new RuntimeException();
        }
        this.color = color;
    }

    public abstract void start();
    public abstract void drive();

    public void stop() {
        System.out.println(make + " " + model + " is stopped");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
1. Create an Abstract Class Named 'Car':
    - Variables:
        - final make
        - final model
        - final year
        - price
        - color
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions for setting fields:
        - make, model, color must not be null or empty.
        - year must not be less than 1886.
        - price must not be negative.
    - Abstract Methods:
        - start()
        - drive()
    - Non-Abstract Methods:
        - stop()
        - toString()
 */
