import javax.swing.*;
import java.awt.event.*;

public class KeyTypedExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Key Listener");
        JTextField textField = new JTextField();
        JLabel label = new JLabel("Typed: ");

        textField.setBounds(50, 50, 200, 30);
        label.setBounds(50, 100, 200, 30);

        textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                label.setText("Typed: " + e.getKeyChar());
            }
        });

        frame.setLayout(null);
        frame.add(textField);
        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
