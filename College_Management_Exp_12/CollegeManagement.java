import student.Student;
import faculty.Faculty;

public class CollegeManagement {

    public static void main(String[] args) {

        Student s = new Student(101, "Rahul", "Computer Science");

        Faculty f = new Faculty(201, "Dr. Sharma", "Computer Science");

        s.displayStudent();

        System.out.println();

        f.displayFaculty();
    }
}