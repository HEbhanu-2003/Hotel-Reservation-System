package Controller;

import Model.SingInModel;
import Model.SingUpModel;
import MySqlConnection.RegistrationConnection;
import View.SingInVIew;
import View.SingUpView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SingInController {
    SingInVIew view;
    SingInModel model;

    public SingInController(SingInVIew view, SingInModel model) {
        this.view = view;
        this.model = model;
        this.view.signInButton(new SingInButtonListener());
    }

    class SingInButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (model.userLogin(view.getUserName(),view.getPassword())){
                JOptionPane.showMessageDialog(null, "Login Unsuccessful");
            } else {
                JOptionPane.showMessageDialog(null, "Login Successful");
            }

        }
    }
}
