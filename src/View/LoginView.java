package View;

import Controller.LoginController;

import javax.swing.*;

public class LoginView extends JFrame {
    private JPanel loginPanel;
    private JTextField userNameTextField;
    private JPasswordField passwordField;
    private JLabel userNameLabel;
    private JLabel passwordLabel;
    private JButton loginButton;

    public LoginView() {
        super("Log in");
        setContentPane(loginPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        LoginController controller =  new LoginController(this, loginButton);

        loginButton.addActionListener(controller);
    }

    public String getUserName() { return userNameTextField.getText(); }
    public String getPassword() { return String.copyValueOf(passwordField.getPassword()); }

    public void emptyBoxes() {
        userNameTextField.setText("");
        passwordField.setText("");
    }
}
