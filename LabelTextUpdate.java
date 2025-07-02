import javax.swing.*;
import java.awt.event.*;

public class LabelTextUpdate {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Label Update");
        JLabel label = new JLabel("Type something:");
        JTextField textField = new JTextField();

        textField.setBounds(50, 50, 200, 30);
        label.setBounds(50, 100, 200, 30);

        textField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                label.setText("You typed: " + textField.getText());
            }
        });

        frame.setLayout(null);
        frame.add(label);
        frame.add(textField);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
