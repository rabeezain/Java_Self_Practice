package day11_class_object_part2.restaurant;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LocalRestaurant {

    public static void main(String[] args) {

     Restaurant restaurant = new Restaurant("Ali", "Houston", 4);

    Server[] servers = {
            new Server("Ahmed", 1245, 25.0, true),
            new Server("John", 1246, 21.0, false),
            new Server("Mike", 1242, 19, false),
            new Server("Rabee", 1247, 20.5, true),
            new Server("Ayat", 1248, 22.0, true)
    };

    Chef[] chefs = {
            new Chef("Hazel", 1300, 30, true),
            new Chef("Erick", 1350, 32, false),
            new Chef("Ameer", 1360, 33, true)
    };

    restaurant.hireServer(new Server("Sarah", 1570, 28, true));
    restaurant.hireChef(new Chef("Ayat", 1259, 33, true));

    restaurant.hireServer(servers);
    restaurant.hireChef(chefs);

        System.out.println(restaurant);

}
}
/*
Create a class named LocalRestaurant with a main method:
	Create a Restaurant object
	Create an array of servers and chefs with their information set
	Add the initial servers and chefs to the respective ArrayLists in the Restaurant object
	Print the whole restaurant's information
 */