package Model;

import MySqlConnection.RegistrationConnection;
import View.ManageRoomsView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ManageRoomsModel {
    private int roomNumber;
    private String roomType;
    private String beds;
    private int days;
    private double price;

    ManageRoomsView view;


    public void setRoomNumber(int RoomNumber) {
        roomNumber = RoomNumber;
    }
    public void setRoomType(String RoomType) {
        roomType = RoomType;
    }
    public void setBeds(String Beds) {
        beds = Beds;
    }
    public void setDays(int Days) {
        days = Days;
    }
    public void setPrice(double Price) {
        price = Price;
    }

    public boolean addRoom() throws SQLException, Exception {
        System.out.println(roomNumber);
        System.out.println(roomType);
        System.out.println(beds);
        System.out.println(days);
        System.out.println(price);

        String sql = "INSERT INTO managerooms(RoomNumber, RoomType, Bed, Days,Price) VALUES (?, ?, ?, ?, ?)";

        Connection connection = RegistrationConnection.getDatabaseConnection();

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, roomNumber);
        statement.setString(2, roomType);
        statement.setString(3, beds);
        statement.setInt(4, days);
        statement.setDouble(5, price);

        int rowsInserted = statement.executeUpdate();
        return rowsInserted > 0;
    }
    public boolean updateRoom() throws SQLException, Exception {

        String sql = "UPDATE managerooms SET roomType=?, bed=?, days=? ,price=? WHERE RoomNumber=?";

        Connection connection = RegistrationConnection.getDatabaseConnection();

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, roomType);
        statement.setString(2, beds);
        statement.setInt(3, days);
        statement.setDouble(4, price);
        statement.setInt(5, roomNumber);

        int rowsInserted = statement.executeUpdate();
        return rowsInserted > 0;
    }
    public boolean deleteRoom() throws SQLException, Exception {
        String sql = "DELETE FROM managerooms WHERE roomNumber=?";

        Connection connection = RegistrationConnection.getDatabaseConnection();

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, roomNumber);

        int rowsInserted = statement.executeUpdate();
        return rowsInserted > 0;
    }
}