import javax.swing.*;

public class EmployeeRegistrationForm {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Employee Registration Form");

        JLabel idLabel = new JLabel("Employee ID:");
        JTextField idField = new JTextField();

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel deptLabel = new JLabel("Department:");
        JTextField deptField = new JTextField();

        JLabel salaryLabel = new JLabel("Salary:");
        JTextField salaryField = new JTextField();

        JButton submitButton = new JButton("Submit");

        frame.setLayout(null);

        idLabel.setBounds(50, 30, 120, 30);
        idField.setBounds(180, 30, 150, 30);

        nameLabel.setBounds(50, 80, 120, 30);
        nameField.setBounds(180, 80, 150, 30);

        deptLabel.setBounds(50, 130, 120, 30);
        deptField.setBounds(180, 130, 150, 30);

        salaryLabel.setBounds(50, 180, 120, 30);
        salaryField.setBounds(180, 180, 150, 30);

        submitButton.setBounds(130, 230, 100, 30);

        frame.add(idLabel);
        frame.add(idField);

        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(deptLabel);
        frame.add(deptField);

        frame.add(salaryLabel);
        frame.add(salaryField);

        frame.add(submitButton);

        submitButton.addActionListener(e -> {

            JOptionPane.showMessageDialog(
                    frame,
                    "Employee ID: " + idField.getText()
                    + "\nName: " + nameField.getText()
                    + "\nDepartment: " + deptField.getText()
                    + "\nSalary: " + salaryField.getText()
            );
        });

        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}