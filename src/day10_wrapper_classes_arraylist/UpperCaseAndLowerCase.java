package day10_wrapper_classes_arraylist;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {

        String str = "JAVA java";
        int i = 0, j = 0;
        boolean result = false;

        for (char each : str.toCharArray()) {

            if (Character.isUpperCase(each)) {
                i++;
            } else if (Character.isLowerCase(each)) {
                j++;
            }
        }

        if(i == j){ result = true; }
        else { result = false; }
            System.out.println(result);
    }
}
/*
Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.

	        Eamplex:
	            str = "JAVA java";

	        output:
	            true
 */