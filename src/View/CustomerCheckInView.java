package View;

import javax.swing.*;
import java.awt.*;

public class CustomerCheckInView extends JFrame {
    private JFormattedTextField formattedTextField4;
    private JFormattedTextField formattedTextField3;
    private JTextField textField1;
    private JFormattedTextField formattedTextField1;
    private JButton allocateRoomButton;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JButton updateAllocationButton;
    private JPanel panel1;
    private JTextField price;
    private JTextField roomNumber;
    private JTextField roomType;
    private JTextField bedType;


    public CustomerCheckInView(int v1,String v2, String v3,double v4){

        this.setTitle("Customer Check In");
        this.setSize(890,550);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        roomNumber.setText(String.valueOf(v1));
        roomType.setText(v2);
        bedType.setText(v3);
        price.setText(String.valueOf(v4));

        Container container = this.getContentPane();
        container.add(panel1);
    }

}
