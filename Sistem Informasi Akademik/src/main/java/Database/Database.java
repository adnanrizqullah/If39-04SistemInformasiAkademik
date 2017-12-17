package Database;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Model.UserDsn;
import Model.UserMhs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Munip
 */
public class Database {
      private Connection connection;
      Statement statement;
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
    
    public UserMhs getMhs(String uname, String pass) {
        UserMhs m = null;
        try {

            String query = "SELECT * FROM PEMINJAM where username = '"
                    + uname + "' " + "AND password = '" + pass + "'";
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                m = new UserMhs();
                m.setUname(rs.getString(2));
                m.setPass(rs.getString(3));
                

            }

            return m;
        } catch (SQLException ex) {

            System.out.println("Login gagal " + ex);
            return null;

        }
    }

    public UserDsn getDsn(String uname, String pass) {
        UserDsn d = null;
        try {

            String query = "SELECT * FROM PEMINJAM where username = '"
                    + uname + "' " + "AND password = '" + pass + "'";
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                d = new UserDsn();
                d.setUname(rs.getString(2));
                d.setPass(rs.getString(3));
               

            }

            return d;
        } catch (SQLException ex) {

            System.out.println("Login gagal " + ex);
            return null;

        }
    }
}
