import javax.swing.*;
import java.awt.event.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();
        JLabel result = new JLabel("Result: ");
        
        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");

        num1.setBounds(50, 30, 100, 30);
        num2.setBounds(160, 30, 100, 30);
        add.setBounds(50, 70, 50, 30);
        sub.setBounds(110, 70, 50, 30);
        mul.setBounds(170, 70, 50, 30);
        div.setBounds(230, 70, 50, 30);
        result.setBounds(50, 120, 200, 30);

        ActionListener operation = e -> {
            try {
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                String op = e.getActionCommand();
                double r = switch (op) {
                    case "+" -> a + b;
                    case "-" -> a - b;
                    case "*" -> a * b;
                    case "/" -> b != 0 ? a / b : Double.NaN;
                    default -> 0;
                };
                result.setText("Result: " + r);
            } catch (NumberFormatException ex) {
                result.setText("Enter valid numbers");
            }
        };

        add.addActionListener(operation);
        sub.addActionListener(operation);
        mul.addActionListener(operation);
        div.addActionListener(operation);

        frame.setLayout(null);
        frame.add(num1);
        frame.add(num2);
        frame.add(add);
        frame.add(sub);
        frame.add(mul);
        frame.add(div);
        frame.add(result);
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
