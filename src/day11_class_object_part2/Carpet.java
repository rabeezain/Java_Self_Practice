package day11_class_object_part2;

public class Carpet {

    public double width, length, unitPrice;
    public boolean isPersian;
    public double calCost() {

        double totalPrice = 0;

        if (isPersian) {
            totalPrice = (width * length * unitPrice) + 200;
            return totalPrice;
        } else if (!isPersian) {
            totalPrice = width * length * unitPrice;
            return totalPrice;
        } else return 0;
    }

    public String toString() {
        return "Carpet{" +
                "width= " + width +
                ", length= " + length +
                ", unitPrice= " + unitPrice +
                ", isPersian= " + isPersian +
                ", totalPrice= $" + calCost() +
                '}';
    }
}
/*
Create a custom class named Carpet with the following specifications:

    Attributes:
   			width
   			length
   			unitPrice
   			isPersian (boolean)

    Actions:
		calcCost(): calculate the total cost of the carpet and return it as a double.
   		toString(): display all the info of the carpet, including the total cost of the carpet as calculated by calcCost()

   Price calculation formula:
   		Total price of carpet = (width * length) * unitPrice
   		If the carpet is Persian, add $200 to the totalPrice

    Create another class named CarpetClients, create multiple carpet objects, and test each function of the carpet object.
 */