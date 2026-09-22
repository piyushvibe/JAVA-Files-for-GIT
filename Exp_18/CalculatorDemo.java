import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorDemo extends JFrame implements ActionListener {

    JTextField num1, num2;
    JButton addButton, subButton;
    JLabel result;

    CalculatorDemo() {

        num1 = new JTextField(10);
        num2 = new JTextField(10);

        addButton = new JButton("Add");
        subButton = new JButton("Subtract");

        result = new JLabel("Result: ");

        addButton.addActionListener(this);
        subButton.addActionListener(this);

        setLayout(new FlowLayout());

        add(new JLabel("Number 1:"));
        add(num1);

        add(new JLabel("Number 2:"));
        add(num2);

        add(addButton);
        add(subButton);
        add(result);

        setSize(400, 200);
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(num1.getText());
        int b = Integer.parseInt(num2.getText());

        if (e.getSource() == addButton) {
            result.setText("Result: " + (a + b));
        }

        if (e.getSource() == subButton) {
            result.setText("Result: " + (a - b));
        }
    }

    public static void main(String[] args) {
        new CalculatorDemo();
    }
}