package Model;

import MySqlConnection.RegistrationConnection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerCheckInModel {
    private String nationality;
    private String mobileNumber;
    private String customerName;
    private String address;
    private double price;
    private int roomNumber;
    private String roomType;
    private String bedType;
    private String idProof;
    private String gender;

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public void setIdProof(String idProof) {
        this.idProof = idProof;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean roomAllocation() throws SQLException, Exception {
        Connection connection = RegistrationConnection.getDatabaseConnection();
        String sql = "INSERT INTO customercheckin (customerName, address, mobileNumber, nationality, gender, price, roomNumber, roomType, bedType, idProof) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1, customerName);
        ps.setString(2, address);
        ps.setString(3, mobileNumber);
        ps.setString(4, nationality);
        ps.setString(5, gender);
        ps.setDouble(6, price);
        ps.setInt(7, roomNumber);
        ps.setString(8, roomType);
        ps.setString(9, bedType);
        ps.setString(10, idProof);

        int rowsInserted = ps.executeUpdate();
        return rowsInserted > 0;
    }

    public boolean updateRoomAllocation() throws SQLException, Exception {
        Connection connection = RegistrationConnection.getDatabaseConnection();
        String sql = "UPDATE customercheckin SET cutomerName = ?, address = ?, mobileNumber = ?, nationality = ?, gender = ? WHERE idProof = ?";
        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1, customerName);
        ps.setString(2, address);
        ps.setString(3, mobileNumber);
        ps.setString(4, nationality);
        ps.setString(5, gender);
        ps.setString(6, idProof);

        int rowsInserted = ps.executeUpdate();
        return rowsInserted > 0;
    }

    public boolean deleteRoomAllocation() throws SQLException, Exception {
        Connection connection = RegistrationConnection.getDatabaseConnection();
        String sql = "DELETE FROM customercheckin WHERE idProof = ?";
        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1, idProof);

        int rowsInserted = ps.executeUpdate();
        return rowsInserted > 0;
    }
}

