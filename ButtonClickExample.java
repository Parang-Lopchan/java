import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonClickExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Click Button");
        JButton button = new JButton("Click Me");

        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button Clicked"));

        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        button.setBounds(100, 70, 100, 30);
        frame.setVisible(true);
    }
}
