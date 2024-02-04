package day05_loops;

public class EnglishAlphabets {

    public static void main(String[] args) {

        char letters = 'A';

        for (int i = 1; i < 27; i++) {

            System.out.print(letters + " ");

            ++letters;

        }

    }
}
/*
Create a class named EnglishAlphabets, and write a program that displays alphabet letters from A to Z in the
same line separated by a space.
 */