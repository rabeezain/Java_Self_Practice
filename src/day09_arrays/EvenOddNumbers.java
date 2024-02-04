package day09_arrays;

public class EvenOddNumbers {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int even = 0;
        int odd = 0;

        for (int evenOrOdd : array) {

            if (evenOrOdd % 2 == 0) { even++; }
            else { odd++; }

        }
        System.out.println("The array has " + odd + " numbers and " + even + " numbers.");
    }
}
/*
3. Create a class named EvenOddNumbers and write a program that counts the even and odd numbers from an array of integers.

			Example:
				array = {1, 2, 3, 4, 5, 6, 7};

			Output:
				The array has 4 odd numbers and 3 even numbers.

 */