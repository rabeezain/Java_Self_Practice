package day13_inheritance.student;

public class UndergraduateStudent extends Student2 {
    public UndergraduateStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        // super.study();
        System.out.println(getName() + " is Undergraduate student at " + getSchoolName() + " School");
    }
}
/*
3.2 UndergraduateStudent:
       - Same as GraduateStudent.
 */