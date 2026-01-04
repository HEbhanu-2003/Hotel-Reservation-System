package View;

import Controller.CustomerCheckOutController;
import Model.CustomerCheckOutModel;
import MySqlConnection.RegistrationConnection;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerCheckOutView extends JFrame {
    private JPanel panel1;
    private JTable table1;
    private JTable table2;
    private JTable table3;
    private JTable table4;
    private JButton RoomUpdateButton;
    private JButton RoomDeteButton;

    public CustomerCheckOutView(){
        this.setTitle("Customer Check Out");
        this.setSize(890,550);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        Container contentPane = this.getContentPane();
        contentPane.add(panel1);

        MangeRoomsLoadTableData();

    }

    private void MangeRoomsLoadTableData() {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Room Number");
        model.addColumn("Room Type");
        model.addColumn("Bed Type");
        model.addColumn("Days");
        model.addColumn("Price");

        try {
            Connection con = RegistrationConnection.getDatabaseConnection();
            String sql = "SELECT * FROM managerooms";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt("RoomNumber"),
                        rs.getString("RoomType"),
                        rs.getString("Bed"),
                        rs.getInt("Days"),
                        rs.getDouble("Price")
                });
            }

            table1.setModel(model);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
