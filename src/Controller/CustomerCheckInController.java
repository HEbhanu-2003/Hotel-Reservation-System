package Controller;

import Model.CustomerCheckInModel;
import View.CustomerCheckInView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class CustomerCheckInController {
    private CustomerCheckInView view;
    private CustomerCheckInModel model;

    public CustomerCheckInController(CustomerCheckInView view, CustomerCheckInModel model) {
        this.view = view;
        this.model = model;

        this.view.allocateRoomButtonActionListener(new AllocateRoomButtonListener());
        this.view.updateAllocatedRoomButtonListener(new UpdateAllocationButtonActionListener());
        this.view.deleteAllocatedRoomButtonListener(new DeleteAllocationButtonActionListener());
    }

    class AllocateRoomButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = view.getCustomerName().trim();
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error", "Customer name cannot be empty", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!name.matches("[a-zA-Z ]+")) {
                JOptionPane.showMessageDialog(null, "Error", "Customer name cannot contain numbers or symbols", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String mobile = view.getMobileNumber().trim();
            if (mobile.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error", "Mobile number cannot be empty", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!mobile.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "Error", "Mobile number must contain only digits", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (mobile.length() != 10) {
                JOptionPane.showMessageDialog(null, "Error", "Mobile number must be exactly 10 digits", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String nationality = view.getNationality().trim();
            if (nationality.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error", "Nationality cannot be empty", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!nationality.matches("[a-zA-Z ]+")) {
                JOptionPane.showMessageDialog(null, "Error", "Nationality can only have letters", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (view.getSelectedGender().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error", "Please select the gender", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String idProof = view.getIdProof().trim();
            if (idProof.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error", "Id number cannot be empty", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (idProof.matches(".*[a-zA-Z].*")) {
                JOptionPane.showMessageDialog(null, "Error", "Id number cannot only have letters", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String address = view.getAddress().trim();
            if (address.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error", "Address cannot be empty", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!address.matches(".*[a-zA-Z].*")) {
                JOptionPane.showMessageDialog(null, "Error", "Address cannot be only numbers", JOptionPane.ERROR_MESSAGE);
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

            try {
                boolean success = model.roomAllocation();

                if (success) {
                    JOptionPane.showMessageDialog(null, "Room allocated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Room allocation failed", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (SQLException e1) {
                JOptionPane.showMessageDialog(null, "Failed to allocate a room (DB error)", "Error", JOptionPane.ERROR_MESSAGE);
            }
            catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "Something went wrong", "Error", JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }

    class UpdateAllocationButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = view.getCustomerName().trim();
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error", "Customer name cannot be empty", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!name.matches("[a-zA-Z ]+")) {
                JOptionPane.showMessageDialog(null, "Error", "Customer name cannot contain numbers or symbols", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String mobile = view.getMobileNumber().trim();
            if (mobile.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error", "Mobile number cannot be empty", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!mobile.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "Error", "Mobile number must contain only digits", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (mobile.length() != 10) {
                JOptionPane.showMessageDialog(null, "Error", "Mobile number must be exactly 10 digits", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String nationality = view.getNationality().trim();
            if (nationality.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error", "Nationality cannot be empty", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!nationality.matches("[a-zA-Z ]+")) {
                JOptionPane.showMessageDialog(null, "Error", "Nationality can only have letters", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (view.getSelectedGender().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error", "Please select the gender", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String idProof = view.getIdProof().trim();
            if (idProof.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error", "Id number cannot be empty", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (idProof.matches(".*[a-zA-Z].*")) {
                JOptionPane.showMessageDialog(null, "Error", "Id number cannot only have letters", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String address = view.getAddress().trim();
            if (address.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error", "Address cannot be empty", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!address.matches(".*[a-zA-Z].*")) {
                JOptionPane.showMessageDialog(null, "Error", "Address cannot be only numbers", JOptionPane.ERROR_MESSAGE);
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

            try {
                boolean success = model.updateRoomAllocation();

                if (success) {
                    JOptionPane.showMessageDialog(null, "Room updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
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

    class DeleteAllocationButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String idProof = view.getIdProof().trim();
            if (idProof.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error", "Id number cannot be empty", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (idProof.matches(".*[a-zA-Z].*")) {
                JOptionPane.showMessageDialog(null, "Error", "Id number cannot only have letters", JOptionPane.ERROR_MESSAGE);
                return;
            }

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

            try {
                boolean success = model.deleteRoomAllocation();

                if (success) {
                    JOptionPane.showMessageDialog(null, "Room deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
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
