package day04_selection_statements;

public class GradeLevel1 {

    public static void main(String[] args) {

        byte gradLevel = 116;

        if ( (gradLevel >= 1) && (gradLevel <= 5)){

            System.out.println("Elementary School");}

       else if ( (gradLevel >= 6) && (gradLevel <= 8)){

            System.out.println("Middle School");}

       else if ( (gradLevel >= 9) && (gradLevel <= 12)){

            System.out.println("High School");}

       else if ( (gradLevel >= 13) && (gradLevel <= 16)){

            System.out.println("Collage");}

       else if ( (gradLevel >= 17) && (gradLevel <= 18)){

            System.out.println("Grad School");}

        else {System.out.println("Invalid grade level");}

    }
}
/*
Create a class called GradeLevel. Given a number (byte) gradeLevel, determine and print which
	school type someone is in. The grade levels and types are:

		1-5: Elementary school
		6-8: Middle school
		9-12: High school
		13-16: College
		17-18: Grad School
		For any other grade level, print "Invalid grade level."

			Example:
				   gradeLevel = 8

			Output:
				  Middle school
 */