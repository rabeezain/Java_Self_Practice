package day12_encapsulation;

public class Circle {
    private double radius;
    private static final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
       }

    public void setRadius(double radius) {
        if (radius <= 0) {System.err.println("Radius can not be zero or negative"); System.exit(1);}

        this.radius = radius;
    }

    public double calcArea(){
        return radius * radius * PI;
       }

       public double calcPerimeter(){
        return 2 * radius * PI;
       }

        public String toString() {
        return "Circle{" +
                " radius = " + radius +
                ", area = " + calcArea() +
                ", perimeter = " + calcPerimeter() +
                '}';
    }
}
/*
Create a custom class named Circle with the following specifications:

	Attributes:
		radius

	Ensure encapsulation for the field.
		Condition:
			The radius cannot be set to a negative or zero value.

	Add a constructor that allows the user to set the field during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the circle object.
		calcPerimeter(): Calculates and returns the perimeter of the circle object.
		toString(): Displays the radius, area, and perimeter of the circle when the object is printed.

	Create another class named CircleClients, create multiple circle objects, and test each function of the circle object.
 */


