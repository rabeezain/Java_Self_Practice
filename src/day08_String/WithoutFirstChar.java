package day08_String;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first work");
        String word1 = input.next();
        System.out.println("Enter the second word");
        String word2 = input.next();
        String result = word1.substring(1).concat(word2.substring(1));

        System.out.println(result);


    }
}

/*
2. Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana
 */