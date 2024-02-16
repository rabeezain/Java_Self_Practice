package day11_class_object_part2;

public class CydeoStudentClients {
    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Rabee", 43, 1250, 'B', 50, 20);
        CydeoStudent student2 = new CydeoStudent("Ayat", 43, 1240, 'A', 51, 21);

        student1.study();
        student1.attendance();
        student1.printSchoolName();
        student1.printProgLanguage();

        student2.study();
        student2.attendance();
        student2.printSchoolName();
        student2.printProgLanguage();


    }
}
