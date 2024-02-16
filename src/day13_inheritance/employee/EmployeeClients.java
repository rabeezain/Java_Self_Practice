package day13_inheritance.employee;

public class EmployeeClients {

    public static void main(String[] args) {

        Tester tester = new Tester("Ali", "H120", "Engineer", 90_000, "Hexaware");

        System.out.println(tester);
        tester.work();

        Developer developer = new Developer("Hazel", "G121", "Technician", 80_000,
                                            "Subsea7", "Java");

        System.out.println(developer);
        developer.work();

    }
}
/*
3. Create a class named "EmployeeClients":
   - Create multiple objects representing different employees.
   - Test the methods and attributes of each object.

 */