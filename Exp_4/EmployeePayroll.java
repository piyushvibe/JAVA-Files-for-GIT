import java.util.Scanner;

public class EmployeePayroll {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        String idInput = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        String salaryInput = sc.nextLine();

        System.out.print("Enter Bonus: ");
        String bonusInput = sc.nextLine();

        try {
            // Convert String values into wrapper objects
            Integer employeeId = Integer.valueOf(idInput);
            Double basicSalary = Double.valueOf(salaryInput);
            Double bonus = Double.valueOf(bonusInput);

            // Validation
            if (employeeId <= 0) {
                System.out.println("Invalid Employee ID.");
            }
            else if (basicSalary <= 0) {
                System.out.println("Invalid Basic Salary.");
            }
            else if (bonus < 0) {
                System.out.println("Bonus cannot be negative.");
            }
            else {
                // Calculate net salary
                Double netSalary = basicSalary + bonus;

                System.out.println("\n--- Employee Payroll ---");
                System.out.println("Employee ID: " + employeeId);
                System.out.println("Basic Salary: Rs. " + basicSalary);
                System.out.println("Bonus: Rs. " + bonus);
                System.out.println("Net Salary: Rs. " + netSalary);
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric values.");

        }

        sc.close();
    }
}