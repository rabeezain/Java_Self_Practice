package day14_abstraction_polymorphism.device;

public abstract class Phone extends Device {

    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    public void call(long phoneNum) {
        System.out.println(getBrand() + " " + getModel() + " Calling " + phoneNum);
    }

    public void text(long phoneNum){
        System.out.println(getBrand() + " " + getModel() + " Texting " + phoneNum);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " is turned off");
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
/*
2. Create a Child Abstract Class of Device Named 'Phone':
    - Extra Non-Abstract Methods:
        - call(long phoneNum)
        - text(long phoneNum)
        - toString()
 */