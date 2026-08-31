interface Printable {
    void printDetails();
}

class Student implements Printable {

    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public void printDetails() {
        System.out.println("--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

class Employee implements Printable {

    String name;
    int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    @Override
    public void printDetails() {
        System.out.println("--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

public class PrintableDemo {
    public static void main(String[] args) {

        Student s = new Student("Piyush", 101);
        Employee e = new Employee("Rahul", 501);

        s.printDetails();

        System.out.println();

        e.printDetails();
    }
}