package day07_class_objects_part1;

import java.rmi.MarshalException;
import java.rmi.registry.Registry;

public class RectangleClient {

    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle();

        rec1.width = 5;
        rec1.length = 4;

        double area =rec1.calculateArea(rec1.width, rec1.length);
        double perimeter = rec1.calculatePerimeter(rec1.width, rec1.length);
        System.out.println(area);
        System.out.println(perimeter);
    }
}
