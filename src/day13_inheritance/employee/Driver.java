package day13_inheritance.employee;

public class Driver extends Employee {
    public Driver(String employeeName, String employeeId, String jobTitle, double salary, String companyName) {
        super(employeeName, employeeId, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getEmployeeName() + " is driving");
    }
}
/*
2.4 Driver:
       - work(): Displays "[name] is driving".

   - Add any additional fields or methods as necessary.

 */