package day07_class_objects_part1;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the cents;");
        int cents = input.nextInt();

        int dollars = cents / 100;
        int cent = cents % 100;
        input.close();
        System.out.println(cents + " cents is equal to " + dollars + " dollars and " + cent + " cents");

    }
}
/*
8. Create a class named CentsToDollars and write a program that asks the user to enter the number of cents and
convert the given cents to dollars. Include any remainder in the result.

        Example:
             Enter the cents:
             Input: 225

        Output:
             225 cents is equal to 2 dollars and 25 cents

 */