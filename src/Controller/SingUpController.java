package Controller;

import Model.SingUpModel;
import View.HomeView;
import View.SingInVIew;
import View.SingUpView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class SingUpController {
    SingUpView view;
    SingUpModel model;

    public SingUpController (SingUpView view, SingUpModel model) {
        this.view = view;
        this.model = model;
        this.view.signUpButton(new SingUpButtonListener());
    }

    class SingUpButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.setFullName(view.getFullName());
            model.setEmail(view.getEmail());
            model.setUserName(view.getUserName());
            model.setPassword(view.getPassword());

            try{
                if (view.fullNameTextField.getText().isEmpty() || view.userNameTextField.getText().isEmpty() ||
                        view.emailTextField.getText().isEmpty() || view.passwordField1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill all the fields!");
                }
                else if(model.registration()){
                    JOptionPane.showMessageDialog(null, "Register successfully");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Registration Failed");
                }
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }

        }
    }

}

