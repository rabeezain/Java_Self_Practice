package day14_abstraction_polymorphism.device;

import javax.print.attribute.DocAttribute;

public class Iphone extends Phone implements Downloadable, AppleApps {
    public Iphone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " is downloading the app");
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
}
/*
7. Create the Following Subclasses of Phone:
    - 'Iphone':
        - Extends Phone class.
        - Implements Downloadable & AppleApps interfaces.
 */