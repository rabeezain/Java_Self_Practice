package day04_selection_statements;

public class Grade2 {

    public static void main(String[] args) {

        char grade = 'x';

        switch (grade) {

            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Great job");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Faild");
                break;

            default:

                System.out.println("Invalid Grade");

        }
    }

}
/*
Create a class called Grade2. A char variable named grade is given.
   Write a program to print the following messages:

		'A': Excellent
		'B': Great job
		'C': Good
		'D': Passed
		'F': Failed
		Otherwise: Invalid Grade

			Example:
				   grade = 'B'

			Output:
				   Great job
 */