package day05_loops;

public class FactorialNumber {

    public static void main(String[] args) {

        int num = 5;
        int fac = 1;

        for (int i = num; i >= 1; i--) {

           fac = i * fac;

        }
        System.out.println(fac);
    }
}
/*
Write a program that can return the factorial number of any given number.

				Example:
					  num = 5

				Output:
					  120

			(because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */