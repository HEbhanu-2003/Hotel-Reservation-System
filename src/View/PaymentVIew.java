package View;

import javax.swing.*;
import java.awt.*;

public class PaymentVIew extends JFrame {
    private JPanel panel1;
    private JPanel pane1;
    private JComboBox comboBox1;
    private JRadioButton radioButton1;
    private JPasswordField passwordField1;

    public PaymentVIew() {
        this.setTitle("PaymentVIew");
        this.setSize(890,550);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        Container contentPane = this.getContentPane();
        contentPane.add(panel1);
    }
}
