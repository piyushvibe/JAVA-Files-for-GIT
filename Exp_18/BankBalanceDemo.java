import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BankBalanceDemo extends JFrame implements ActionListener {

    JTextField balance, amount;
    JButton depositButton, withdrawButton;
    JLabel result;

    BankBalanceDemo() {

        balance = new JTextField(10);
        amount = new JTextField(10);

        depositButton = new JButton("Deposit");
        withdrawButton = new JButton("Withdraw");

        result = new JLabel("Balance: ");

        depositButton.addActionListener(this);
        withdrawButton.addActionListener(this);

        setLayout(new FlowLayout());

        add(new JLabel("Initial Balance:"));
        add(balance);

        add(new JLabel("Transaction Amount:"));
        add(amount);

        add(depositButton);
        add(withdrawButton);
        add(result);

        setSize(450, 200);
        setTitle("Bank Balance Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        int b = Integer.parseInt(balance.getText());
        int a = Integer.parseInt(amount.getText());

        if (e.getSource() == depositButton) {
            result.setText("Balance: " + (b + a));
        }

        if (e.getSource() == withdrawButton) {
            result.setText("Balance: " + (b - a));
        }
    }

    public static void main(String[] args) {
        new BankBalanceDemo();
    }
}