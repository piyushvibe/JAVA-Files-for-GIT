
class Student {

    String name;
    int rollNo;

    // Default Constructor
    Student() {
        name = "Piyush";
        rollNo = 101;
    }

    // Parameterized Constructor
    Student(String n, int r) {
        name = n;
        rollNo = r;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }

    public static void main(String[] args) {

        Student s1 = new Student();                // Default Constructor
        Student s2 = new Student("Rahul", 102);    // Parameterized Constructor

        System.out.println("Default Constructor:");
        s1.display();

        System.out.println();

        System.out.println("Parameterized Constructor:");
        s2.display();
    }
}
