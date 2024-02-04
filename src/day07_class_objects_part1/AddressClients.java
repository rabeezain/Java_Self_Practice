package day07_class_objects_part1;

public class AddressClients {

    public static void main(String[] args) {

        Address address1 = new Address();
        Address address2 = new Address();

        address1.buildingNumber = 7925;
        address1.street = "Jones Branch Dr";
        address1.city = "McLean";
        address1.state = "VA";
        address1.zipCode = "22012";

        address2.buildingNumber = 2925;
        address2.street = "Jones Branch Dr 1";
        address2.city = "McLean 1";
        address2.state = "VA 1";
        address2.zipCode = "32012";

        address1.display();
        address2.display();

    }
}
