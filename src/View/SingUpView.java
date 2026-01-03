package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SingUpView extends JFrame {
    private JPanel pane1;
    private JButton singInButton;
    public JTextField fullNameTextField;
    public JTextField emailTextField;
    public JTextField userNameTextField;
    private JButton signUpButton;
    private JLabel yourAlreadyAccountLabel;
    public JPasswordField passwordField1;

    public SingUpView(){
        this.setTitle("SingUpModel");
        this.setSize(650,450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        Container contentPane = this.getContentPane();
        contentPane.add(pane1);

        singInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new SingInVIew();
                dispose();
            }
        });

    }
    public String getFullName(){
        return fullNameTextField.getText();
    }
    public String getEmail(){
        return emailTextField.getText();
    }

    public String getUserName(){
        return userNameTextField.getText();
    }
    public String getPassword(){
        return passwordField1.getText();
    }

    public void signUpButton(ActionListener Listener) {
        signUpButton.addActionListener(Listener);

    }
    public void signInButton(ActionListener Listener) {
        signUpButton.addActionListener(Listener);

    }



}
