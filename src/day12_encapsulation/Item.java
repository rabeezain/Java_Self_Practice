package day12_encapsulation;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
               return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.isEmpty()) {System.err.println("Name can not be empty or blank"); System.exit(1);}

        boolean isSpecialChar;
        boolean isStartWithLetter;

        for (int i = 0; i < name.toCharArray().length; i++) {

            if (isSpecialChar = !Character.isLetterOrDigit(name.charAt(i))){
                System.err.println("The name can not contain special character");
                System.exit(1); }
            else if(isStartWithLetter = !Character.isLetter(name.charAt(0))){
                System.err.println("The first digit of the name should be a letter");
                System.exit(1); }
            }

        this.name = name; }

    public double getUnitPrice() {

        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {

        if (unitPrice < 0){
            System.err.println("The price can not be negative");
            System.exit(1); }

        this.unitPrice = unitPrice;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {

        if (quantity < 0){
            System.err.println("The quantity can not be negative");
            System.exit(1); }

        this.quantity = quantity;
    }

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){
        return unitPrice * quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", calcCost=" + calcCost() +
                '}';
    }
}
/*
Create a custom class named Item with the following specifications:

	Attributes:
		name
		unitPrice
		quantity

	Ensure encapsulation for all fields.
		Conditions:
			The name cannot be empty or blank.
			The name cannot contain any special characters other than space.
			The name must start with letters.
			The unitPrice cannot be negative.
			The quantity cannot be negative.

	Add a constructor that enables the user to set all fields during object creation.

	Actions:
		calcCost(): Returns the total cost.
		toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.

	Create another class named ItemClients, create multiple item objects, and test each function of the item object.
 */