package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddMealsItemsView extends JFrame {
    private JPanel panel1;
    private JPanel pane1;
    private JComboBox breakFirst;
    private JComboBox lunch;
    private JComboBox diner;
    private JComboBox fruits;
    private JComboBox noodles;
    private JButton deleteAllocationButton;
    private JTextField roomType;
    private JTextField bedType;
    private JTextField roomNumber;
    private JComboBox drinks;
    private JComboBox cofee;
    private JComboBox juse;
    private JComboBox pizza;
    private JTextField priceField;

    public AddMealsItemsView(int v1,String v2, String v3,double v4){
        this.setTitle("Add Meals Items");
        this.setSize(890,550);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        roomNumber.setText(String.valueOf(v1));
        roomType.setText(v2);
        bedType.setText(v3);
        priceField.setText(String.valueOf(v4));

        Container container = this.getContentPane();
        container.add(panel1);

        breakFirst.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String breakFirstSelect = breakFirst.getSelectedItem().toString();

                if (breakFirstSelect.equals("1")) {

                    int calCalculatePrice = 450;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                    Double.parseDouble(priceField.getText());

                }
                else if (breakFirstSelect.equals("2")) {

                    int calCalculatePrice = 450*2;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (breakFirstSelect.equals("3")) {

                    int calCalculatePrice = 450*3;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (breakFirstSelect.equals("0")) {

                    double basePrice = Double.parseDouble(priceField.getText());

                    priceField.setText(String.valueOf(basePrice));
                }
            }
        });
        lunch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String lunchSelect = lunch.getSelectedItem().toString();

                if (lunchSelect.equals("1")) {

                    int calCalculatePrice = 550;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (lunchSelect.equals("2")) {

                    int calCalculatePrice = 550*2;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (lunchSelect.equals("3")) {

                    int calCalculatePrice = 550*3;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (lunchSelect.equals("0")) {

                    double basePrice = Double.parseDouble(priceField.getText());

                    priceField.setText(String.valueOf(basePrice));
                }
            }
        });
        diner.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String dinerSelect = diner.getSelectedItem().toString();

                if (dinerSelect.equals("1")) {

                    int calCalculatePrice = 650;


                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (dinerSelect.equals("2")) {

                    int calCalculatePrice = 650*2;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (dinerSelect.equals("3")) {

                    int calCalculatePrice = 650*3;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (dinerSelect.equals("0")) {

                    double basePrice = Double.parseDouble(priceField.getText());

                    priceField.setText(String.valueOf(basePrice));
                }
            }
        });
        fruits.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String fruitsSelect = fruits.getSelectedItem().toString();

                if (fruitsSelect.equals("1")) {

                    int calCalculatePrice = 150;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (fruitsSelect.equals("2")) {

                    int calCalculatePrice = 150*2;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (fruitsSelect.equals("3")) {

                    int calCalculatePrice = 150*3;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (fruitsSelect.equals("0")) {

                    double basePrice = Double.parseDouble(priceField.getText());

                    priceField.setText(String.valueOf(basePrice));
                }
            }
        });
        noodles.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String noodlesSelect = noodles.getSelectedItem().toString();

                if (noodlesSelect.equals("1")) {

                    int calCalculatePrice = 350;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (noodlesSelect.equals("2")) {

                    int calCalculatePrice = 350*2;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (noodlesSelect.equals("3")) {

                    int calCalculatePrice = 350*3;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (noodlesSelect.equals("0")) {

                    double basePrice = Double.parseDouble(priceField.getText());

                    priceField.setText(String.valueOf(basePrice));
                }
            }
        });
        drinks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String drinksSelect = drinks.getSelectedItem().toString();

                if (drinksSelect.equals("1")) {

                    int calCalculatePrice = 250;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (drinksSelect.equals("2")) {

                    int calCalculatePrice = 250*2;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (drinksSelect.equals("3")) {

                    int calCalculatePrice = 250*3;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (drinksSelect.equals("0")) {

                    double basePrice = Double.parseDouble(priceField.getText());

                    priceField.setText(String.valueOf(basePrice));
                }
            }
        });
        cofee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String cofeeSelect = cofee.getSelectedItem().toString();

                if (cofeeSelect.equals("1")) {

                    int calCalculatePrice = 100;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (cofeeSelect.equals("2")) {

                    int calCalculatePrice = 100*2;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (cofeeSelect.equals("3")) {

                    int calCalculatePrice = 100*3;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (cofeeSelect.equals("0")) {

                    double basePrice = Double.parseDouble(priceField.getText());

                    priceField.setText(String.valueOf(basePrice));
                }
            }
        });
        juse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String juseSelect = juse.getSelectedItem().toString();

                if (juseSelect.equals("1")) {

                    int calCalculatePrice = 120;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (juseSelect.equals("2")) {

                    int calCalculatePrice = 120*2;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (juseSelect.equals("3")) {

                    int calCalculatePrice = 120*3;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (juseSelect.equals("0")) {

                    double basePrice = Double.parseDouble(priceField.getText());

                    priceField.setText(String.valueOf(basePrice));
                }
            }
        });
        pizza.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String pizzaSelect = pizza.getSelectedItem().toString();

                if (pizzaSelect.equals("1")) {

                    int calCalculatePrice = 1200;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (pizzaSelect.equals("2")) {

                    int calCalculatePrice = 1200*2;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (pizzaSelect.equals("3")) {

                    int calCalculatePrice = 1200*3;

                    double basePrice = Double.parseDouble(priceField.getText());

                    double finalPrice = basePrice + calCalculatePrice;

                    priceField.setText(String.valueOf(finalPrice));
                }
                else if (pizzaSelect.equals("0")) {

                    double basePrice = Double.parseDouble(priceField.getText());

                    priceField.setText(String.valueOf(basePrice));
                }
            }
        });

    }

}
