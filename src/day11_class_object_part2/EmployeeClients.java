package day11_class_object_part2;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Rabee", 43, 'M', "Engineer", 2500);
        Employee employee2 = new Employee("Ayat", 43, 'F', "Technician", 2700);

        employee1.work();
        employee2.work();

    }
}
