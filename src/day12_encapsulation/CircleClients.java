package day12_encapsulation;

import java.lang.Math.*;

public class CircleClients {
    public static void main(String[] args) {

        Circle circle1 = new Circle(2.5);

        circle1.setRadius(circle1.getRadius());
        System.out.println(circle1.calcArea());
        System.out.println(circle1.calcPerimeter());

        Circle circle2 = new Circle(5.0);
        circle2.setRadius(circle1.getRadius());
        System.out.println(circle2.calcArea());
        System.out.println(circle2.calcPerimeter());


    }
}
