import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter marks for Subject 2: ");
        String s2 = sc.nextLine();

        System.out.print("Enter marks for Subject 3: ");
        String s3 = sc.nextLine();

        // Convert String to Integer
        Integer marks1 = Integer.parseInt(s1);
        Integer marks2 = Integer.parseInt(s2);
        Integer marks3 = Integer.parseInt(s3);

        // Calculate total
        Integer total = marks1 + marks2 + marks3;

        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
        System.out.println("Marks in Subject 3: " + marks3);
        System.out.println("Total Marks: " + total);

        sc.close();
    }
}