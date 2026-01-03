package Model;

import MySqlConnection.RegistrationConnection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SingUpModel {
    private String fullName;
    private String email;
    private String password;
    private String userName;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUserName(String userName) {
        this.userName= userName;
    }


    public boolean registration() {
        System.out.println(fullName);
        System.out.println(email);
        System.out.println(password);
        System.out.println(userName);
        String sql = "INSERT INTO hotelregistration(fullName, email,userName, password) VALUES (?, ?, ?, ?)";

        try(Connection connection = RegistrationConnection.getDatabaseConnection();

            PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setString(1, fullName);
            statement.setString(2, email);
            statement.setString(3, userName);
            statement.setString(4, password);

            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;

        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    public boolean checkQuery(String fullName) {

        try (Connection connection = RegistrationConnection.getDatabaseConnection()) {

            String sql = "SELECT * FROM hotelregistration WHERE fullName=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, fullName);

            ResultSet rs = ps.executeQuery();
            return rs.next();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
