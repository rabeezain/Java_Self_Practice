package day07_class_objects_part1;

public class EmployeeClient {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.name = "Rabee";
        emp1.age = 43;
        emp1.gender = 'M';
        emp1.jobTitle = "Engineer";
        emp1.salary = 28_000;

        emp1.work();

        System.out.println(emp1);

    }
}
