package day13_inheritance.employee;

public class Developer extends Employee {

    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public Developer(String employeeName, String employeeId, String jobTitle, double salary, String companyName,
                     String programmingLanguage) {
        super(employeeName, employeeId, jobTitle, salary, companyName);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getEmployeeName() + " is coding " + programmingLanguage);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "employeeName='" + getEmployeeName() + '\'' +
                ", employeeId='" + getEmployeeId() + '\'' +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                ", companyName='" + getCompanyName() + '\'' +
                "programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
/*
2.2 Developer:
       - Extra Variable:
           - programmingLanguage: String
       - work(): Displays "[jobTitle] [name] is coding in [programmingLanguage]".
 */