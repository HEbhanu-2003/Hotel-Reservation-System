package View;

import javax.swing.*;
import java.awt.*;

public class AddMealsItemsView extends JFrame {
    private JPanel panel1;
    private JPanel pane1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JComboBox comboBox6;
    private JButton deleteAllocationButton;
    private JTextField roomType;
    private JTextField bedType;
    private JTextField price;
    private JTextField roomNumber;

    public AddMealsItemsView(int v1,String v2, String v3,double v4){
        this.setTitle("Add Meals Items");
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
