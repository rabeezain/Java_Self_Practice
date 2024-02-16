package day13_inheritance.employee;

public class Teacher extends Employee {
    public Teacher(String employeeName, String employeeId, String jobTitle, double salary, String companyName) {
        super(employeeName, employeeId, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getEmployeeName() + " is teaching");
    }
}
/*
2.3 Teacher:
       - work(): Displays "[name] is teaching".

 */