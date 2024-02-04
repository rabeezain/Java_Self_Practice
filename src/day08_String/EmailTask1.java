package day08_String;

public class EmailTask1 {

    public static void main(String[] args) {

        String email = "mike.tyson@gmail.com";
        int underScore = email.indexOf("_");
        int atSign = email.indexOf("@");

        //System.out.println(firstName + " " + lastName);

        String newEmail;

     if (email.contains("_")) {

         String firstName = email.substring(0,underScore);
         String lastName = email.substring(underScore + 1, atSign);
         String domain = email.substring(atSign);
            newEmail = firstName.replace(firstName, lastName) + "_" + firstName + domain ;
            System.out.println(newEmail);}

        else {System.out.println(email);   }

    }
}
/*
4. Create a class called EmailTask1. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that can swap the first name with the last name in the email
(separated by an underscore). If the email doesn't contain an underscore, print the given input email.

        Example:
              Input:
                 mike_tyson@gmail.com

              Output:
                  tyson_mike@gmail.com
 */