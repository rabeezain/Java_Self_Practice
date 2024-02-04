package day09_arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

    int[] array = {1,2,3,4,5};
    int[] reversArray = new int[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {

            reversArray[j] = array[i];
       }
        System.out.println("reversArray= " + Arrays.toString(reversArray));
    }
}
/*
Create a class named ReverseArray and write a program to reverse an array of integers and return it as a new one.

			Example:
				array = {1,2,3,4,5};

			Output:
				reversedArray = {5,4,3,2,1};
 */