package day14_abstraction_polymorphism.device;

public class Google extends Phone implements Downloadable, AndroidApps {

    public Google(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public String toString() {
        return "Phone {" +
                "brand = '" + getBrand() + '\'' +
                ", model = '" + getModel() + '\'' +
                ", price = " + getPrice() +
                ", color = '" + getColor() + '\'' +
                ", size = '" + getSize() + '\'' +
                ", hasBattery = " + isHasBattery() +
                ", hasPowerButton = " + isHasPowerButton() +
                '}';
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " is downloading the app");
    }
}
/*
- 'Google':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.
 */