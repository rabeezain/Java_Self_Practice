package day10_wrapper_classes_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,3,3,4,5,5));
        // ArrayList<Integer> unique = new ArrayList<>();

        // unique.addAll(list);

        list.removeIf( p -> Collections.frequency(list, p) > 1);

        System.out.println(list);

    }
}
/*
Create a class called UniqueElements and write a program with the following specifications:
   9.1 Given an ArrayList, display the unique elements without using any loops.

			Example:
				list = [1, 1, 2, 3, 3, 4, 5, 5]

			output:
				[2, 4]

 */