package day14_abstraction_polymorphism.device;

public class DeviceShop {

    public static void main(String[] args) {


PersonalComputer laptop = new Laptop("Dell", "IX250", 500, "Silver", "15.6", true,
                 true);
PersonalComputer desktop = new Desktop("HP", "H120", 400, "Black", "Medium", false,
                 true);
Phone Iphone = new Iphone("Apple", "Iphone 15", 800, "Pink", "Pro", true, true);
Phone samsung = new Samsung("Samsung", "S24", 980, "White", "Ultra", true, true);
Phone google = new Google("Google", "Pixel 8", 700, "Green", "large", true, true);

        System.out.println(laptop);
        System.out.println(desktop);
        System.out.println(Iphone);
        System.out.println(samsung);
        System.out.println(google);
        samsung.call(123456789);
        samsung.text(123456789);

        samsung.turnOn();
        samsung.turnOff();
}
    }
/*
9. Create a Class Named 'DeviceShop':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.
 */
