package day07_class_objects_part1;

public class ItemClients {

    public static void main(String[] args) {

        Item item1 = new Item();
        Item item2 = new Item();

        item1.itemName = "Orange";
        item1.unitPrice = 2.0;
        item1.quantity = 50;

        item2.itemName = "Berry";
        item2.unitPrice = 2.5;
        item2.quantity = 10;

        item1.calcCost(item1.unitPrice, item1.quantity);
        item2.calcCost(item2.unitPrice, item2.quantity);

    }
}
