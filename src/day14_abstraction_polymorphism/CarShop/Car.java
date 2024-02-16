package day14_abstraction_polymorphism.CarShop;

public class Car {

    String model;
    String color;
    int year;
    double price;

    public Car(String model, String color, int year, double price) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
