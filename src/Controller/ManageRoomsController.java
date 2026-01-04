package Controller;

import Model.ManageRoomsModel;
import View.ManageRoomsView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

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

            try {
                boolean success = model.addRoom();

                if (success) {
                    JOptionPane.showMessageDialog(null, "Room added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    view.dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Room failed to add", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (SQLException e1) {
                JOptionPane.showMessageDialog(null, "Failed to add a room (DB error)", "Error", JOptionPane.ERROR_MESSAGE);
            }
            catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "Something went wrong", "Error", JOptionPane.ERROR_MESSAGE
                );
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

            try {
                boolean success = model.updateRoom();

                if (success) {
                    JOptionPane.showMessageDialog(null, "Room updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    view.dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Room failed to update", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (SQLException e1) {
                JOptionPane.showMessageDialog(null, "Failed to update a room (DB error)", "Error", JOptionPane.ERROR_MESSAGE);
            }
            catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "Something went wrong", "Error", JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }
    class deleteActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.setRoomNumber(view.getRoomNumberField());

            try {
                boolean success = model.deleteRoom();

                if (success) {
                    JOptionPane.showMessageDialog(null, "Room deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    view.dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Room failed to delete", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (SQLException e1) {
                JOptionPane.showMessageDialog(null, "Failed to delete a room (DB error)", "Error", JOptionPane.ERROR_MESSAGE);
            }
            catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "Something went wrong", "Error", JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }
}