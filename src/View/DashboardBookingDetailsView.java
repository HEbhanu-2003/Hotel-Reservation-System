package View;

import javax.swing.*;
import java.awt.*;

public class DashboardBookingDetailsView extends JFrame {
    private JPanel panel1;
    private JTable table1;
    private JTable table3;
    private JTable table2;
    private JTable table4;

    public DashboardBookingDetailsView(){
        this.setTitle("Booking Details");
        this.setSize(890,550);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        Container contentPane = this.getContentPane();
        contentPane.add(panel1);

    }
}
