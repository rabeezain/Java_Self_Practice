package day07_class_objects_part1;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner radius = new Scanner(System.in);

        System.out.println("Enter the radius:");
        int input = radius.nextInt();

        double area = input*input*3.14;
        double perimeter = input*2*3.14;
radius.close();
        System.out.println("The area of the Circle is " + area);
        System.out.println("The perimeter of the Circle is " + perimeter);

    }
}
/*
6. Create a class named Circle and write a program that asks the user to enter the radius of the Circle and calculate
the area and perimeter of the Circle.

        Example:
             Enter the radius:
             Input: 5

        Output:
             The area of the Circle is 78.5
             The perimeter of the Circle is 31.4
 */