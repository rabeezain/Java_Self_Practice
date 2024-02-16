package day11_class_object_part2;

public class PizzaClients {

    public static void main(String[] args) {

   Pizza pizza1 = new Pizza();
   Pizza pizza2 = new Pizza();
   Pizza pizza3 = new Pizza();

   pizza1.size = "small";
   pizza1.numberOfCheeseTopping = 3;
   pizza1.numberOfPepperoniTopping = 2;
   System.out.println(pizza1);

        pizza2.size = "large";
        pizza2.numberOfCheeseTopping = 2;
        pizza2.numberOfPepperoniTopping = 4;
        System.out.println(pizza2);

        pizza3.size = "medium";
        pizza3.numberOfCheeseTopping = 1;
        pizza3.numberOfPepperoniTopping = 1;
        System.out.println(pizza3);

    }
}
