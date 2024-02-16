package day13_inheritance.student;

public class Student2 extends Student {

    private String studentId;
    private String fieldOfStudy;
    private char grade;
    private String schoolName;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student2(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        this.studentId = studentId;
        this.fieldOfStudy = fieldOfStudy;
        this.grade = grade;
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(getName() + " " + schoolName);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", studentId='" + studentId + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
/*
2. Create a subclass named "Student" with the following specifications:
   Attributes:
       - studentId: String
       - fieldOfStudy: String
       - grade: char
       - schoolName: String

   Encapsulation:
       - Same as previous tasks.

   Actions:
       - study(): Displays a message stating the student's name and school.
       - toString(): Prints the information of the Student object (including all attributes).
 */