package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeView extends JFrame{
    private JPanel panel2;
    private JButton manageRoomButton;
    private JButton paymentButton;
    private JButton addMealsItemsButton;
    private JButton cutomerCheckInButton;
    private JButton logOutButton;
    private JButton cutomerCheckOutButton;

    private String storedVal1 = "";
    private String storedVal2 = "";
    private String storedVal3 = "";
    private String storedVal4 = "";

    public HomeView() {

        this.setTitle("HomeView");
        this.setSize(1920, 1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        setLocationRelativeTo(null);

        Container contentPane = this.getContentPane();
        contentPane.add(panel2);

        manageRoomButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ManageRoomsView();

            }
        });
        addMealsItemsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AddMealsItemsView();
            }
        });
        paymentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new PaymentVIew();
            }
        });
        cutomerCheckOutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CustomerCheckOutView();
            }
        });
        logOutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        cutomerCheckInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CustomerCheckInView();
            }
        });


    }



}
