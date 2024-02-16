package day12_encapsulation;

import java.rmi.registry.Registry;

public class RectangleClients {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(2.5, 4.5);

        rectangle1.setLength(rectangle1.getLength());
        rectangle1.setWidth(rectangle1.getWidth());
        System.out.println(rectangle1.calcArea());
        System.out.println(rectangle1.calcPerimeter());
        System.out.println(rectangle1);


    }
}
