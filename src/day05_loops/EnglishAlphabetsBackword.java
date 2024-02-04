package day05_loops;

public class EnglishAlphabetsBackword {

    public static void main(String[] args) {

        char letters = 'Z';

        for (int i = 1; i < 27; i++) {

            System.out.print(letters + " ");

            --letters;

        }

    }
}
/*
Create a class named EnglishAlphabetsBackward, and write a program that can display the alphabet letters from Z to A in
the same line separated by a space.
 */