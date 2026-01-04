package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CustomerCheckInView extends JFrame {
    private JFormattedTextField txtNationality;
    private JFormattedTextField txtMobileNumber;
    private JTextField txtCustomerName;
    private JFormattedTextField txtAddress;
    private JButton allocateRoomButton;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JButton updateAllocationButton;
    private JPanel panel1;
    private JTextField price;
    private JTextField roomNumber;
    private JTextField roomType;
    private JTextField bedType;
    private JFormattedTextField txtIdProof;
    private JButton deleteAllocationButton;


    public CustomerCheckInView(int v1, String v2, String v3, double v4){

        this.setTitle("Customer Check In");
        this.setSize(890,550);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        roomNumber.setText(String.valueOf(v1));
        roomType.setText(v2);
        bedType.setText(v3);
        price.setText(String.valueOf(v4));

        Container container = this.getContentPane();
        container.add(panel1);

        this.setVisible(true);
    }

    public String getNationality() {
        return txtNationality.getText();
    }

    public String getMobileNumber() {
        return txtMobileNumber.getText();
    }

    public String getCustomerName() {
        return txtCustomerName.getText();
    }

    public String getAddress() {
        return txtAddress.getText();
    }

    public String getPrice() {
        return price.getText();
    }

    public String getRoomNumber() {
        return roomNumber.getText();
    }

    public String getRoomType() {
        return roomType.getText();
    }

    public String getBedType() {
        return bedType.getText();
    }

    public String getIdProof() {
        return txtIdProof.getText();
    }

    public void allocateRoomButtonActionListener(ActionListener listener) {
         allocateRoomButton.addActionListener(listener);
    }

    public void updateRoomButtonListener(ActionListener listener) {
        updateAllocationButton.addActionListener(listener);
    }

    public void deleteRoomButtonListener(ActionListener listener) {
        deleteAllocationButton.addActionListener(listener);
    }

    public String getSelectedGender() {
        if (maleRadioButton.isSelected()) return "Male";
        if (femaleRadioButton.isSelected()) return "Female";
        return null;
    }
}
