package day06_methods;

public class OddAndEvenMethod {

    public static void main(String[] args) {

        boolean result = isOdd(10);

        System.out.println(result);

        boolean results = isEven(20);

        System.out.println(results);

    }

    public static boolean isOdd (int num){


        if (num % 2 == 1){

            boolean result = true;

            return result;
        }

        else {
            boolean result = false;
            return result;
        }

    }

    public static boolean isEven(int num) {

        if (num % 2 == 0) {
            boolean results = true;
            return results;
        } else {
            boolean results = false;
            return results;
        }
    }

}
/*
1. Create a class named OddAndEven:

	1.1 Create a method named isOdd that returns true if a number is odd. Otherwise, it returns false.

			Example:
				boolean result = isOdd(100);

			Output:
				false

	1.2 Create a method named isEven that returns true if a number is even. Otherwise, it returns false.

			Example:
				boolean result = isEven(100);

			Output:
				true
 */