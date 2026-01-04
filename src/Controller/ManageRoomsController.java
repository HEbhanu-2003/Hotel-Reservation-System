package Controller;

import Model.ManageRoomsModel;
import View.ManageRoomsView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageRoomsController {
    ManageRoomsView view;
    ManageRoomsModel model;

    public ManageRoomsController(ManageRoomsView view, ManageRoomsModel model) {
        this.view = view;
        this.model = model;
        this.view.addRoomActionListener(new AddButtonListener());
        this.view.updateRoomActionListener(new updateActionListener());
        this.view.deleteRoomActionListener(new deleteActionListener());

    }

    class AddButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.setRoomNumber(view.getRoomNumberField());
            model.setRoomType(view.getRoomType());
            model.setBeds(view.getBedType());
            model.setDays(view.getDaysField());
            model.setPrice(view.getPriceField());
            //double total = model.calculatePrice();
            //System.out.println(total);

            if (model.addRoom()) {
                JOptionPane.showMessageDialog(null, "Room added successfully", "Add Room", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "failed to add Room", "Not Add Room", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    class updateActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.setRoomNumber(view.getRoomNumberField());
            model.setRoomType(view.getRoomType());
            model.setBeds(view.getBedType());
            model.setDays(view.getDaysField());
            model.setPrice(view.getPriceField());
            //double total = model.calculatePrice();
            //System.out.println(total);

            try {

                if (model.updateRoom()) {
                    JOptionPane.showMessageDialog(null, "Room updated successfully","Done",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "failed to updated Room","error",JOptionPane.ERROR_MESSAGE);
                }
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }
    class deleteActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.setRoomNumber(view.getRoomNumberField());

            if (model.deleteRoom()) {
                JOptionPane.showMessageDialog(null, "Room deleted successfully","Done",JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "failed to deleted room","error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}