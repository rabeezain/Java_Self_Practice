package day13_inheritance.employee;

public class Tester extends Employee {
    public Tester(String employeeName, String employeeId, String jobTitle, double salary, String companyName) {
        super(employeeName, employeeId, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getEmployeeName() + " is testing");
    }
}
/*
2.1 Tester:
       - work(): Displays "[jobTitle] [name] is testing".
 */