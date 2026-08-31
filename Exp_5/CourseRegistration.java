import java.util.ArrayList;
import java.util.Scanner;

public class CourseRegistration {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> courses = new ArrayList<>();

        while (true) {

            System.out.println("\n--- COURSE REGISTRATION SYSTEM ---");
            System.out.println("1. Add Course");
            System.out.println("2. Remove Course");
            System.out.println("3. View Registered Courses");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter course name: ");
                    String course = sc.nextLine();

                    if (courses.contains(course)) {
                        System.out.println("Course is already registered.");
                    } else {
                        courses.add(course);
                        System.out.println("Course registered successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Enter course name to remove: ");
                    String removeCourse = sc.nextLine();

                    if (courses.remove(removeCourse)) {
                        System.out.println("Course removed successfully.");
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;

                case 3:
                    StringBuffer courseList = new StringBuffer();

                    if (courses.isEmpty()) {
                        courseList.append("No courses registered.");
                    } else {
                        courseList.append("\nRegistered Courses:\n");

                        for (int i = 0; i < courses.size(); i++) {
                            courseList.append(i + 1)
                                      .append(". ")
                                      .append(courses.get(i))
                                      .append("\n");
                        }
                    }

                    System.out.println(courseList);
                    break;

                case 4:
                    System.out.println("Exiting Course Registration System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}