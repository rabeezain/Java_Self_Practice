package day06_methods;

public class MathUtility {

    public static void main(String[] args) {

        int result1 = calculate(10, '+', 20);
        System.out.println(result1);

        double result = calculate(2.5, '*', 3.0);
        System.out.println(result);

        int square = square(8);
        System.out.println(square);

        double square1 = square(1.5);
        System.out.println(square1);

        System.out.println(cube(3));

        System.out.println(cube(2.5));

    }

    public static int calculate(int num1, char operator, int num2) {

        int result;
        switch (operator) {
            case '+': return result = num1 + num2;
            case '-': return result = num1 - num2;
            case '*': return result = num1 * num2;
            case '/': return result = num1 / num2;
            default: return result = 0; }
    }

        public static double calculate ( double num1, char operator, double num2){

            double result;
            switch (operator) {
                case '+': return result = num1 + num2;
                case '-': return result = num1 - num2;
                case '*': return result = num1 * num2;
                case '/': return result = num1 / num2;
                default: return result = 0;
            }
        }

        public static int square (int num){
        return calculate(num, '*', num);
        }

        public static double square (double num){
        return calculate(num, '*', num);
        }

        public static int cube(int num){
        int cube;
        return cube = square(3 ) * num;
        }

        public static double cube(double num){
        return square(num) * num;
        }
    }

/*
5. Create a class named MathUtility:

	5.1 Create a method named calculate that takes three arguments (Two integers and a char) and returns the result based on the operator.

		If the operator is +:
			The method should return the addition of the two numbers

		If the operator is -:
			The method should return the subtraction of the two numbers

		If the operator is *:
			The method should return the multiplication of the two numbers

		If the operator is /:
			The method should return the multiplication of the two numbers

	for any other operators, the method should return 0


			Example:
				int result = calculate(10, '+', 20);

			Output:
				30


	5.2 Overload the calculate method to handle double numbers.

			Example:
				double result = calculate(2.5, '*', 3.0);

			Output:
				7.5


	5.3 Create a method named square that takes an int and returns the square, hierarchically calling the
	calculate method to calculate the square.

			Example:
				int num = square(8);

			Output:
				64

	5.4 Overload the square method for double numbers.

			Example:
				double num = square(1.5);

			Output:
				2.25

	5.5 Create a method named cube that takes an int and returns the cube, hierarchically calling the
	square method to calculate the cube.

			Example:
				int num = cube(3);

			Output:
				9

	5.6 Overload the cube method for double numbers.

			Example:
				double num = cube(2.5);

			Output:
				15.625
 */