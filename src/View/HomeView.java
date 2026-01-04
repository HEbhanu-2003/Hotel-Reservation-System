package View;

import Controller.CustomerCheckInController;
import Controller.ManageRoomsController;
import Model.CustomerCheckInModel;
import Model.ManageRoomsModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class HomeView extends JFrame{
    private JPanel panel2;
    private JButton manageRoomButton;
    private JButton paymentButton;
    private JButton addMealsItemsButton;
    private JButton cutomerCheckInButton;
    private JButton logOutButton;
    private JButton cutomerCheckOutButton;

    ManageRoomsView manageRoomsView;
    CustomerCheckInView  customerCheckInView;
    AddMealsItemsView addMealsItemsView;

    public HomeView() {

        this.setTitle("Home View");
        this.setSize(1920, 1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        setLocationRelativeTo(null);

        Container contentPane = this.getContentPane();
        contentPane.add(panel2);

        manageRoomButton.addActionListener(e -> {
            manageRoomsView = new ManageRoomsView();
            ManageRoomsModel model1 = new ManageRoomsModel();
            new ManageRoomsController(manageRoomsView, model1);
            manageRoomsView.setVisible(true);

        });
        cutomerCheckInButton.addActionListener(e -> {

            if (manageRoomsView != null) {

                CustomerCheckInView customerCheckInView =
                        new CustomerCheckInView(
                                manageRoomsView.getRoomNumberField(),
                                manageRoomsView.getRoomType(),
                                manageRoomsView.getBedType(),
                                manageRoomsView.getPriceField()
                        );

                CustomerCheckInModel model = new CustomerCheckInModel();

                new CustomerCheckInController(customerCheckInView, model);

                customerCheckInView.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(this, "Please First Add Your Room");
            }
        });


        addMealsItemsButton.addActionListener(e -> {
            if (manageRoomsView != null) {
                new AddMealsItemsView(
                        manageRoomsView.getRoomNumberField(),
                        manageRoomsView.getRoomType(),
                        manageRoomsView.getBedType(),
                        manageRoomsView.getPriceField()
                ).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Please First Add customer checking");
            }
        });
        paymentButton.addActionListener(e -> {
            if (manageRoomsView != null) {
                new PaymentVIew(
                        manageRoomsView.getRoomNumberField(),
                        manageRoomsView.getRoomType(),
                        manageRoomsView.getBedType(),
                        manageRoomsView.getPriceField()
                ).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Please First Add meals");
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


    }
}
