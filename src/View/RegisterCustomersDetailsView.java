package View;

import javax.swing.*;
import java.awt.*;

public class RegisterCustomersDetailsView extends JFrame {
    private JPanel panel1;
    private JTable table1;

    public RegisterCustomersDetailsView(){
        this.setTitle("Register Customers Details");
        this.setSize(890,550);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        Container contentPane = this.getContentPane();
        contentPane.add(panel1);

    }
}
