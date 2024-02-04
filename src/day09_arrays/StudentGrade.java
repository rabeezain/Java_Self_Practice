package day09_arrays;

import java.util.Arrays;

public class StudentGrade {
    public static void main(String[] args) {

        String[] studentNames = new String[3];
        int[] scores = new int[3];
        char[] grade = new char[scores.length];

        studentNames[0] = "Anna";
        studentNames[1] = "Nancy";
        studentNames[2] = "Sarah";
        scores[0] = 90;
        scores[1] = 75;
        scores[2] = 80;

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] >= 90) {
                grade[i] = 'A';
            } else if (scores[i] < 90 && scores[i] >= 80) {
                grade[i] = 'B';
            } else if (scores[i] < 80 && scores[i] >= 70) {
                grade[i] = 'C';
            }

        }

        System.out.println(Arrays.toString(grade));

        for (int i = 0; i < studentNames.length; i++) {

            System.out.println(studentNames[i] + "'s score is " + scores[i] + ", and grade is " + grade[i]);

        }
    }
}
/*
Create a class named StudentGrade and write a program with the following specifications:
	4.1 Given two arrays with the same length:
		   studentNames (String[])
		   scores (int[])

   	4.2 Write a program to determine and store the students' grades in an array of characters named grades.

   2.3 Print the grade report for each student in separate lines.

			Example:
				String[] names = {"Anna", "Nancy", "Sarah"};
				int[] scores = {90, 75, 80};

			Output:
				grades = {'A', 'C', 'B'};
				Anna's score is 90, and grade is A
				Nancy's score is 75, and grade is C
				Sarah's score is 80, and grade is B
 */