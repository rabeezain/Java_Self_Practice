package day12_encapsulation;

public class CandyClients {

    public static void main(String[] args) {

        Candy candy1 = new Candy("Haribo", 3, 2.5, true);
        Candy candy2 = new Candy("Twix", 5, 0, false);

        System.out.println(candy1);
        System.out.println(candy2);


    }
}
