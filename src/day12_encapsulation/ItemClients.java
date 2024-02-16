package day12_encapsulation;

public class ItemClients {

    public static void main(String[] args) {

        Item item1 = new Item(" Gum$    ", 5, 3);
        Item item2 = new Item("Sweet", 2.9, 3);

        item1.setName(item1.getName().trim());
        System.out.println(item1.calcCost());
        System.out.println(item1);

        item2.setName(item2.getName().trim());
        System.out.println(item2.calcCost());
        System.out.println(item2);

    }
}
