class Student {
    String Stud_name;

    Student(String Stud_name) {
        this.Stud_name = Stud_name;

    }

    void DisplayStudName() {
        System.out.println("Student name is: " + Stud_name);

    }

}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student studentobj = new Student("Vaidehee Belan");
        studentobj.DisplayStudName();

    }
}
