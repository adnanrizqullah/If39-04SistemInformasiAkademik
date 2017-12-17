/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Munip
 */
public class Database {
      private Connection connection;
 
    public Connection getConnection() {
        return connection;
    }
 
    public void dbConnection() { //<-- untuk koneksi ke database
        // Cek Driver
        try {
            Class.forName("com.mysql.jdbc.Driver"); //<-- nama driver untuk koneksi ke MySQL
 
            // Cek Database
            try {
                String url, user, password;
                url = "jdbc:mysql://localhost:85/sistemakademik"; //alamat DB
                user = "root";
                password = "";
                connection = (Connection) DriverManager.getConnection(url, user, password);
 
                System.out.println("Koneksi Sukses");
            } catch (SQLException se) {
                JOptionPane.showMessageDialog(null, "Koneksi Gagal! " + se);
                System.exit(0);
            }
        } catch (ClassNotFoundException cnfe) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan!" + cnfe);
            System.exit(0);
        }
    }
 
    public static void main(String[] kon) {
        new Database().dbConnection();
    }
}
