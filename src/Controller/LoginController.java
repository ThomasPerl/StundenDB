package Controller;

import View.LoginView;

import Model.UserDB;
import Model.UserModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController implements ActionListener {

    private JButton loginButton;
    private LoginView view;

    public LoginController(LoginView view, JButton loginButton) {
        this.view = view;
        this.loginButton = loginButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loginButton) {
            UserModel foundUser = UserDB.getInstance().getUserByUserName(view.getUserName());
            if (foundUser != null && check_credentials(foundUser)) {
                //new ListView();
                view.dispose();
                return;
            }
            view.emptyBoxes();
        }
    }

    private boolean check_credentials(UserModel user) {

        if (view.getUserName().equals(user.getUserName())) {
            return view.getPassword().equals(user.getPassword());
        }
        return false;
    }
}
