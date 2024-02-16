package day14_abstraction_polymorphism.device;

public class PersonalComputer extends Computer {

    public PersonalComputer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }
}
/*
8. Create the Following Subclasses of Computer:
    - 'PersonalComputer':
        - Desktop
        - Laptop
 */