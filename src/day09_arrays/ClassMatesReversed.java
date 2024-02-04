package day09_arrays;

public class ClassMatesReversed {
    public static void main(String[] args) {

        String[] clasMates = new String[5];
        clasMates[0] = "Ali Ahmed";
        clasMates[1] = "Rabee Hasan";
        clasMates[2] = "Ayat Salah";
        clasMates[3] = "Safa Rabee";
        clasMates[4] = "Shahid Mohamed";
        String reverse = "";

        for (int i = 0; i < clasMates.length; i++) {
            for (int j = clasMates[i].length() - 1; j >= 0; j--) {

               reverse = ""+clasMates[i].charAt(j);
                System.out.print(reverse);
            }
            System.out.println();
                  }

    }
}
/*
Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.
 */