import javax.swing.JFrame;

public class HelloGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello GUI");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
