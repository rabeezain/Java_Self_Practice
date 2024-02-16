package day14_abstraction_polymorphism.device;

public class Laptop extends PersonalComputer {
    public Laptop(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public String toString() {
        return "Personal Computer {" +
                "brand = '" + getBrand() + '\'' +
                ", model = '" + getModel() + '\'' +
                ", price = " + getPrice() +
                ", color = '" + getColor() + '\'' +
                ", size = '" + getSize() + '\'' +
                ", hasBattery = " + isHasBattery() +
                ", hasPowerButton = " + isHasPowerButton() +
                '}';
    }
    }
/*
8. Create the Following Subclasses of Computer:
    - 'PersonalComputer':
        - Desktop
        - Laptop
 */
