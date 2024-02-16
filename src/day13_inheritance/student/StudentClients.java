package day13_inheritance.student;

public class StudentClients {

    public static void main(String[] args) {

        System.out.println("----------------------------Graduate--------------------------------");

        GraduateStudent graduateStudent = new GraduateStudent("Ali", 17, "Male", "G120", "Math",
                                               'B',"Sutton");
        System.out.println(graduateStudent);
        graduateStudent.study();

        System.out.println("----------------------------Undergraduate--------------------------------");

        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Safa", 18, "Female", "D110",
                                                                            "Chemist", 'C', "Bishop");

        System.out.println(undergraduateStudent);
        undergraduateStudent.study();

        System.out.println("----------------------------Cydeo Student--------------------------------");

        CydeoStudent cydeoStudent = new CydeoStudent("Hazel", 16, "Female", "E130", "Biology",
                                                      'A', "HodgeHill", 20, 50,
                                                       "Java");

        System.out.println(cydeoStudent);
        cydeoStudent.study();


    }
}
/*
4. Create a class named "StudentClients":
   - Create multiple objects representing different students.
   - Test the methods and attributes of each object.
 */