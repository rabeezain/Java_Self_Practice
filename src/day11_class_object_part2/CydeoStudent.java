package day11_class_object_part2;

public class CydeoStudent {

    public String name;
    public int age;
    public int id;
    public char grade;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName = "Cydeo";
    public static String programingLanguage = "Java";

    public CydeoStudent(String name, int age, int id, char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name + " is studding");
    }

    public void attendance(){
        System.out.println(name + " is attending the live class");
    }

    public void printSchoolName(){
        System.out.println(CydeoStudent.schoolName);
    }

    public void printProgLanguage(){
        System.out.println(CydeoStudent.programingLanguage);
    }


    public String toString() {
        return "CydeoStudent{" +
                "name= '" + name + '\'' +
                ", age= " + age +
                ", id= " + id +
                ", grade= " + grade +
                ", batchNumber= '" + batchNumber + '\'' +
                ", groupNumber= " + groupNumber +
                '}';
    }
}
/*
Create a custom class named CydeoStudent with the following specifications:

	Attributes:
			name
			age
			id
			grade
			batchNumber
			groupNumber
			schoolName (static)
			programmingLanguage (static)

	Constructors:
			Add a constructor that can set all the fields

	Actions:
		study(): displays the name of the Cydeo student on the console with the concatenated message "is studying."
		attendClass(): displays the name of the Cydeo student on the console with the concatenated message "is attending the live class."
		printSchoolName(): displays the school name
		printProgLanguage(): displays the name of the programming language
		toString(): returns a string representation of the CydeoStudent object.


	Create another class named CydeoStudentClients, create multiple CydeoStudent objects, and test each function of the CydeoStudent
	object.
 */