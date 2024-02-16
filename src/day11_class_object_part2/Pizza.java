package day11_class_object_part2;

public class Pizza {
    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public double calcCost() {
        double totalPrice = 0;

        if (size.equalsIgnoreCase("small")) {
            totalPrice = 10 + (2 * numberOfCheeseTopping) + (2 * numberOfPepperoniTopping); return totalPrice;
        } else if (size.equalsIgnoreCase("medium")) {
            totalPrice = 12 + (2 * numberOfCheeseTopping) + (2 * numberOfPepperoniTopping); return totalPrice;
        } else if (size.equalsIgnoreCase("large")) {
            totalPrice = 14 + (2 * numberOfCheeseTopping) + (2 * numberOfPepperoniTopping); return totalPrice;
        }
         else return 0;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping= " + numberOfCheeseTopping +
                ", numberOfPepperoniTopping= " + numberOfPepperoniTopping +
                ", totalPrice= $" + calcCost() +
                '}';
    }
}
/*
Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping

    Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.

 */