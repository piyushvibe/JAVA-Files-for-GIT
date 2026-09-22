package faculty;

public class Faculty {

    int id;
    String name;
    String department;

    public Faculty(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void displayFaculty() {
        System.out.println("Faculty ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}