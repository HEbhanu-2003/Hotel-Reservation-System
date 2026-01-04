package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageRoomsView extends JFrame {
    private JPanel panel1;
    public JTextField roomNumberField;
    public JFormattedTextField priceField;
    public JFormattedTextField daysField;
    private JButton addRoomButton;
    public JComboBox<String> roomsType;
    public JComboBox<String> bedType;
    private JButton updateRoomButton;
    private JButton deleteRoomButton;

    public ManageRoomsView(){

        this.setTitle("Manage Rooms");
        this.setSize(890,550);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        Container container = this.getContentPane();
        container.add(panel1);

        roomsType.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double calCalculatePrice = 0.0;

                int days = Integer.parseInt(daysField.getText());
                String room = roomsType.getSelectedItem().toString();
                String beds = bedType.getSelectedItem().toString();

                if (room.equals("Ac")) {
                    if(beds.equals("Single")){
                        calCalculatePrice = days * 6000;
                    }
                    else if(beds.equals("Double")){
                        calCalculatePrice = days * 7000;
                    }
                    else if(beds.equals("Triple")){
                        calCalculatePrice = days * 8500;
                    }
                }
                else if (room.equals("Non Ac")) {
                    if(beds.equals("Single")){
                        calCalculatePrice = days * 5000;
                    }
                    else if(beds.equals("Double")){
                        calCalculatePrice = days * 6000;
                    }
                    else if(beds.equals("Triple")) {
                        calCalculatePrice = days * 7000;
                    }
                }
                priceField.setText(String.valueOf(calCalculatePrice));
            }
        });
        bedType.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double calCalculatePrice = 0.0;

                int days = Integer.parseInt(daysField.getText());
                String room = roomsType.getSelectedItem().toString();
                String beds = bedType.getSelectedItem().toString();

                if (room.equals("Ac")) {
                    if(beds.equals("Single")){
                        calCalculatePrice = days * 6000;
                    }
                    else if(beds.equals("Double")){
                        calCalculatePrice = days * 7000;
                    }
                    else if(beds.equals("Triple")){
                        calCalculatePrice = days * 8500;
                    }
                }
                else if (room.equals("Non Ac")) {
                    if(beds.equals("Single")){
                        calCalculatePrice = days * 5000;
                    }
                    else if(beds.equals("Double")){
                        calCalculatePrice = days * 6000;
                    }
                    else if(beds.equals("Triple")) {
                        calCalculatePrice = days * 7000;
                    }
                }
                priceField.setText(String.valueOf(calCalculatePrice));
            }
        });
        daysField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double calCalculatePrice = 0.0;

                int days = Integer.parseInt(daysField.getText());
                String room = roomsType.getSelectedItem().toString();
                String beds = bedType.getSelectedItem().toString();

                if (room.equals("Ac")) {
                    if(beds.equals("Single")){
                        calCalculatePrice = days * 6000;
                    }
                    else if(beds.equals("Double")){
                        calCalculatePrice = days * 7000;
                    }
                    else if(beds.equals("Triple")){
                        calCalculatePrice = days * 8500;
                    }
                }
                else if (room.equals("Non Ac")) {
                    if(beds.equals("Single")){
                        calCalculatePrice = days * 5000;
                    }
                    else if(beds.equals("Double")){
                        calCalculatePrice = days * 6000;
                    }
                    else if(beds.equals("Triple")) {
                        calCalculatePrice = days * 7000;
                    }
                }
                priceField.setText(String.valueOf(calCalculatePrice));
            }
        });
    }
    public int getRoomNumberField(){
        return Integer.parseInt(roomNumberField.getText());
    }
    public int getDaysField(){
        return Integer.parseInt(daysField.getText());
    }
    public String getRoomType(){
        return roomsType.getSelectedItem().toString();
    }
    public String getBedType(){
        return bedType.getSelectedItem().toString();
    }
    public Double getPriceField(){
        return Double.parseDouble(priceField.getText());
    }
    public void addRoomActionListener(ActionListener Listener) {
        addRoomButton.addActionListener(Listener);
    }
    public void updateRoomActionListener(ActionListener Listener) {
        updateRoomButton.addActionListener(Listener);
    }
    public void deleteRoomActionListener(ActionListener Listener) {
        deleteRoomButton.addActionListener(Listener);
    }
}