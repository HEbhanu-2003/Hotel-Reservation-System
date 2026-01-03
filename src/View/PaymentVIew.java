package View;

import javax.swing.*;
import java.awt.*;

public class PaymentVIew extends JFrame {
    private JPanel panel1;
    private JPanel pane1;
    private JRadioButton radioButton1;
    private JPasswordField passwordField1;
    private JFormattedTextField roomNumber;
    private JFormattedTextField bedType;
    private JFormattedTextField roomType;
    private JFormattedTextField price;

    public PaymentVIew(int v1,String v2, String v3,double v4) {
        this.setTitle("PaymentVIew");
        this.setSize(890,550);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        roomNumber.setText(String.valueOf(v1));
        roomType.setText(v2);
        bedType.setText(v3);
        price.setText(String.valueOf(v4));

        Container contentPane = this.getContentPane();
        contentPane.add(panel1);
    }
}
