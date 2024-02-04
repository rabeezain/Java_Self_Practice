package day07_class_objects_part1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score:");
        int score = input.nextInt();

        if (score > 100 || score < 0){System.out.println("Invalid Score");
            return; }
        else if (score <= 100 && score >= 90) {
            System.out.println("Your score is A"); }
        else if (score < 90 && score >= 80){
            System.out.println("Your score is B"); }
        else if (score < 80 && score >= 70){
            System.out.println("Your score is C");
        }

    }

}
/*
7. Create a class named GradeReport and write a program asking the user to enter their score and print the student's grade.

  If the user enters an invalid score (negative or more than 100), print "Invalid Score."

        Example:
             Enter your score:
             Input: 85

        Output:
             Your grade is B
 */