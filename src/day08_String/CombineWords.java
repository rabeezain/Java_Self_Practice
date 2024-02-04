package day08_String;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word");
        String firstWord = input.next();
        int length = firstWord.length();
        int index = length-1;
        System.out.println("Enter your second word");
        String secondWord = input.next();
        char firstWordLastChar = firstWord.charAt(index);
        char lastWordFirsChar = secondWord.charAt(0);

        if (firstWordLastChar == lastWordFirsChar){

            String result = firstWord.concat(secondWord.substring(1));
            System.out.println(result);
        }
    }
}

/*
3. Create a class named CombineWords. Ask the user to enter two words. Then, add them together and print. But if the
last letter of the first word and the first letter of the second word are the same, print that character once.

        Example:
              Input:
                 one
                 eight

              Output:
                   oneight
 */