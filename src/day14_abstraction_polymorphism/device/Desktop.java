package day14_abstraction_polymorphism.device;

public class Desktop extends PersonalComputer{
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

    public Desktop(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }
}
/*
8. Create the Following Subclasses of Computer:
    - 'PersonalComputer':
        - Desktop
        - Laptop
 */