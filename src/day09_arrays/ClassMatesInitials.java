package day09_arrays;

public class ClassMatesInitials {

    public static void main(String[] args) {

        String[] classmates = { "John Lois", "Ali Mohamed", "Dan Richard", "Smith Paul", "Ray Majer", "Ryan King", "Paul Droid", "Alan Arther", "Ian Stone", "Michele Book" };

        for (int i = 0; i < classmates.length; i++) {
            System.out.println(classmates[i].charAt(0) + " " + classmates[i].substring(classmates[i].indexOf(" ") +
                                1, classmates[i].indexOf(" ") + 2));

        }

        }
    }
/*
2. Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.
 */
