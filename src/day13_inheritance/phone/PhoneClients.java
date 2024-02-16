package day13_inheritance.phone;

public class PhoneClients {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone", "Pro Max", "Max", 1500, "White");
        Samsung samsung = new Samsung("Samsung", "S24", "Ultra", 1200, "Black");
        Nokia nokia = new Nokia("Nokia", "5800", "Mini", 950, "Gray");

        System.out.println(iphone);

        iphone.call("07449210075");
        iphone.text("07449210075");
        iphone.faceTime("07449210075");

        System.out.println(samsung);

        samsung.call("07449210075");
        samsung.text("07449210075");
        samsung.faceTime("07449210075");

        System.out.println(nokia);

        nokia.call("07449210075");
        nokia.text("07449210075");
        nokia.faceTime("07449210075");

        iphone.setColor(" ");


    }
}
/*
4. Create a class named "PhoneClients":
   - Create multiple objects representing different phones.
   - Test the methods and variables of each object.
 */