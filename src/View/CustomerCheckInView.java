package View;

import javax.swing.*;
import java.awt.*;

public class CustomerCheckInView extends JFrame {
    private JFormattedTextField formattedTextField4;
    private JFormattedTextField formattedTextField3;
    private JTextField textField1;
    private JFormattedTextField formattedTextField1;
    private JButton allocateRoomButton;
    private JComboBox<String> roomType;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JButton updateAllocationButton;
    private JPanel panel1;
    private JComboBox<String> roomNumber;
    private JComboBox<String> bedType;
    private JFormattedTextField priceField;

    public CustomerCheckInView() {

        this.setTitle("Customer Check In");
        this.setSize(890,550);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        Container container = this.getContentPane();
        container.add(panel1);
    }

}
