package Controller;

import Model.CustomerCheckInModel;
import View.CustomerCheckInView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerCheckInController {
    private CustomerCheckInView view;
    private CustomerCheckInModel model;

    public CustomerCheckInController(CustomerCheckInView view, CustomerCheckInModel model) {
        this.view = view;
        this.model = model;

        this.view.allocateRoomButtonActionListener(new AllocateRoomButtonListener());
    }

    class AllocateRoomButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (view.getCustomerName().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Try Again", "name field cannot be empty", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else if (view.getAddress().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Try Again", "address field cannot be empty", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else if (view.getMobileNumber().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Try Again", "mobile number cannot be empty", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else if (view.getNationality().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Try Again", "nationality cannot be empty", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else if (view.getSelectedGender() == null) {
                JOptionPane.showMessageDialog(null, "Try Again", "gender must be selected", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else if (view.getRoomNumber().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Try Again", "room number cannot be empty", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else if (view.getRoomType().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Try Again", "room type cannot be empty", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else if (view.getBedType().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Try Again", "bed type cannot be empty", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else if (view.getIdProof().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Try Again", "Id proof is mandatory", JOptionPane.WARNING_MESSAGE);
                return;
            }

            model.setNationality(view.getNationality());
            model.setMobileNumber(view.getMobileNumber());
            model.setCustomerName(view.getCustomerName());
            model.setAddress(view.getAddress());

            try {
                model.setPrice(Double.parseDouble(view.getPrice()));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid price");
                return;
            }

            model.setRoomNumber(Integer.parseInt(view.getRoomNumber()));
            model.setRoomType(view.getRoomType());
            model.setBedType(view.getBedType());
            model.setIdProof(view.getIdProof());
            model.setGender(view.getSelectedGender());

            model.roomAllocation();
        }
    }
}
