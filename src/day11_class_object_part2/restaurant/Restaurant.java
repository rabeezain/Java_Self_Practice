package day11_class_object_part2.restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String Owner;
    public String Location;
    public int numberOfStars;
    public ArrayList<Server> servers;
    public ArrayList<Chef> chefs;

    public Restaurant(String owner, String location, int numberOfStars) {
        Owner = owner;
        Location = location;
        this.numberOfStars = numberOfStars;
        servers = new ArrayList<>();
        chefs = new ArrayList<>();
    }

    public void hireServer(Server server) {
        servers.add(server);
    }

    public void hireServer(Server[] servers) {
        this.servers.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef) {
        chefs.add(chef);
    }

    public void hireChef(Chef[] chefs) {
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateChef(int employeeID) {
        for (Chef match : chefs) {
            chefs.removeIf(p -> p.employeeID == employeeID);
        }
    }

    public void terminateServer(int employeeID){
        servers.removeIf(p -> p.employeeID == employeeID);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "Owner='" + Owner + '\'' +
                ", Location='" + Location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", no. of servers=" + servers.size() +
                ", no of chefs=" + chefs.size() +
                '}';
    }
}
/*
Create a custom class named Restaurant with the following specifications:

	Attributes:
			Owner (String)
			Location (String)
			numberOfStars (int)
			Servers (ArrayList of Server objects)
			Chefs (ArrayList of Chef objects)

	Add a constructor that sets the owner, location, and number of stars.

	Actions:
		hireServer(Server server): adds a server object to the Servers ArrayList
		hireServer(Server[] servers): adds an array of Server objects to the Servers ArrayList
		hireChef(Chef chef): adds a chef object to the Chefs ArrayList
		hireChef(Chef[] chefs): adds an array of Chef objects to the Chefs ArrayList
		terminateChef(int employeeID): removes the chef with the matching ID from the Chefs
		ArrayList
		terminateServer(int employeeID): removes the server with the matching ID from the
		Servers ArrayList
		toString(): returns a string representation of the Restaurant object,
		including the number of Servers and Chefs alongside other information
 */