class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    void displayManagerDetails() {
        // Accessing Employee class method using super
        super.displayEmployeeDetails();

        System.out.println("Department: " + department);
    }
}

public class ManagerExample {
    public static void main(String[] args) {

        Manager m = new Manager(
            "Piyush",
            101,
            50000,
            "Computer Science"
        );

        m.displayManagerDetails();
    }
}