package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashBoardView extends JFrame{


    private JPanel panel1;
    private JButton registerCustomersButton;
    private JButton resetDataButton;
    private JButton reportsButton;
    private JButton bookingDetailsButton;
    private JButton logOutButton;

    public DashBoardView() {
        this.setTitle("DashBoardView");
        this.setSize(1920, 1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        Container contentPane = this.getContentPane();
        contentPane.add(panel1);

        bookingDetailsButton.addActionListener(new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new DashboardBookingDetailsView();
            }
        });
        registerCustomersButton.addActionListener(new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new RegisterCustomersDetailsView();
            }
        });
        logOutButton.addActionListener(new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
