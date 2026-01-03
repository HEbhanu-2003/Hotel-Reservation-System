package View;

import javax.swing.*;
import java.awt.*;

public class AddMealsItemsView extends JFrame {
    private JPanel panel1;
    private JComboBox comboBox1;
    private JPanel pane1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JComboBox comboBox6;
    private JButton deleteAllocationButton;

    public AddMealsItemsView(){
        this.setTitle("Add Meals Items");
        this.setSize(890,550);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        Container container = this.getContentPane();
        container.add(panel1);
    }
}
