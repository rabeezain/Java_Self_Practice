package day10_wrapper_classes_arraylist;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {

        String str = "Wooden Spoon123!";
        String letter = "";
        String digits = "";
        String special = "";

        for (char each : str.toCharArray()) {

            if (Character.isLetter(each)){ letter += each; }
            else if(Character.isDigit(each)){ digits += each; }
            else { special += each; }

            }
        System.out.println("Letters = " + "\"" + letter + "\"");
        System.out.println("Digits = " + "\"" + digits + "\"");
        System.out.println("Specials = " + "\"" + special + "\"");

        }
    }
/*
Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";
 */