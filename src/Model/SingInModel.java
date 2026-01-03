package Model;
import MySqlConnection.RegistrationConnection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class SingInModel {

   public boolean userLogin(String userName, String password) {

        try (Connection connection = RegistrationConnection.getDatabaseConnection()) {

            String sql = "SELECT * FROM hotelregistration WHERE userName=? AND password=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            return rs.next();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
