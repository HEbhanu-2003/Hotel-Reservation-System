package View;

import Model.SingInModel;
import Model.SingUpModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.http.WebSocket;
import java.sql.*;

public class SingInVIew extends JFrame {
    private JPanel pane1;
    private JButton signInButton;
   private JTextField userNameField;
    private JPasswordField passwordField1;
    private JButton singUpButton;
    private JLabel yourAlreadyAccountLabel;
    private JComboBox<String> roleComboBox;

    public SingInVIew() {
        this.setTitle("SingInVIew");
        this.setSize(650,450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        SingInModel model = new SingInModel();

        Container contentPane = this.getContentPane();
        contentPane.add(pane1);

        singUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    new SingUpView();
                    dispose();
            }
        });

        roleComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(roleComboBox.getSelectedItem().toString());
            }
        });

        signInButton.addActionListener(e ->{

                String userName = userNameField.getText();
                String password = String.valueOf(passwordField1.getPassword());

                String adminUsername = userNameField.getText();
                String adminPassword = String.valueOf(passwordField1.getPassword());

                boolean success = model.userLogin(userName,password);

                if (userName.isEmpty() || password.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "Please enter your username and password","Try Again",JOptionPane.WARNING_MESSAGE);
                }
                else if (roleComboBox.getSelectedItem().toString().equals("User") && success) {
                    JOptionPane.showMessageDialog(null, "You have successfully logged","Done",JOptionPane.INFORMATION_MESSAGE);
                    new HomeView();
                    dispose();
                }

                else if (roleComboBox.getSelectedItem().toString().equals("Admin") && adminUsername.equals("bhanu") && adminPassword.equals("1234")) {
                    JOptionPane.showMessageDialog(null, "Admin successfully logged","Done",JOptionPane.INFORMATION_MESSAGE);
                    new DashBoardView();
                    dispose();
                }
                else {
                    JOptionPane.showMessageDialog(
                            SingInVIew.this,
                            "Wrong Username or Password",
                            "Try Again",
                          JOptionPane.ERROR_MESSAGE);
                }
        });

    }
    public SingInVIew singInVIew;

    public String getEmail(){
        return userNameField.getText();
    }
    public String getPassword(){
        return passwordField1.getText();
    }
    public String getUserName(){
        return passwordField1.getText();
    }

    public void signUpButton(ActionListener Listener) {
        singUpButton.addActionListener(Listener);
    }
    public void signInButton(ActionListener Listener) {
        signInButton.addActionListener(Listener);
    }

}
