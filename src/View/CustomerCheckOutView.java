package View;

import javax.swing.*;
import java.awt.*;

public class CustomerCheckOutView extends JFrame {
    private JPanel panel1;
    private JTable table1;
    private JTable table2;
    private JTable table3;
    private JTable table4;
    private JButton RoomUpdateButton;
    private JButton RoomDeteButton;

    public CustomerCheckOutView(){
        this.setTitle("Customer Check Out");
        this.setSize(890,550);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        Container contentPane = this.getContentPane();
        contentPane.add(panel1);

    }
}
