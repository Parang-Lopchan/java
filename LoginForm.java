import javax.swing.*;

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        JTextField userText = new JTextField();
        JPasswordField passText = new JPasswordField();
        JButton loginButton = new JButton("Login");

        userLabel.setBounds(50, 30, 80, 25);
        passLabel.setBounds(50, 70, 80, 25);
        userText.setBounds(140, 30, 150, 25);
        passText.setBounds(140, 70, 150, 25);
        loginButton.setBounds(140, 110, 80, 30);

        loginButton.addActionListener(e -> {
            String user = userText.getText();
            String pass = new String(passText.getPassword());
            if ("admin".equals(user) && "password".equals(pass)) {
                JOptionPane.showMessageDialog(frame, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(frame, "Login Failed");
            }
        });

        frame.setLayout(null);
        frame.add(userLabel);
        frame.add(userText);
        frame.add(passLabel);
        frame.add(passText);
        frame.add(loginButton);
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
