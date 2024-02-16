package day13_inheritance.student;

public class CydeoStudent extends Student2 {


    private int batchNumber;
    private int groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName,
                        int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.programmingLanguage = programmingLanguage;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void study() {
        // super.study();
        System.out.println(getName() + " is student at school" + getSchoolName());
    }

    @Override
    public String toString() {
        return super.toString() +
                "batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
/*
3.3 CydeoStudent:
       - Additional Attributes:
           - batchNumber: int
           - groupNumber: int
           - programmingLanguage: String
       - Encapsulation:
           - Same as previous tasks.
       - Constructor:
           - Same as previous tasks.
       - Actions:
           - Override the study method.
           - Override the toString method.
 */