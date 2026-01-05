package MySqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegistrationConnection {
    private  static  final String URL = "jdbc:mysql://localhost:3306/hotelreservationsystem";
    private  static  final String USER = "root";
    private  static  final String PASSWORD = "";

    private RegistrationConnection()
    {
    }


    public static Connection getDatabaseConnection() {
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelreservationsystem", "root", "");
            if (conn != null) {
                System.out.println("Database is Connected!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return conn;
    }


}
