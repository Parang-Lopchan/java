import javax.swing.*;
import java.awt.event.*;

public class MouseButtonExample {
       public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Listener");
        JButton button = new JButton("Hover Over Me");

        button.setBounds(100, 80, 150, 30);
        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                button.setText("Mouse Entered");
            }

            public void mouseExited(MouseEvent e) {
                button.setText("Mouse Exited");
            }
        });

        frame.setLayout(null);
        frame.add(button);
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

