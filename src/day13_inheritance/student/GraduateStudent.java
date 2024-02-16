package day13_inheritance.student;

public class GraduateStudent extends Student2 {


    public GraduateStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        // super.study();
        System.out.println(getName() + " is graduated from " + getSchoolName() + " School");
    }
}
/*
3. Create the following subclasses of the Student class:
   3.1 GraduateStudent:
       - Override the study method.
       - Add any additional fields and methods as necessary.
 */