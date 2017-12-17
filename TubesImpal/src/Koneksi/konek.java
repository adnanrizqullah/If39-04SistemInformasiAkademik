/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author acer
 */
public class konek {
    static Connection Koneksi;
    public static Connection getConnection() {
        try {
            Koneksi = DriverManager.getConnection("jdbc:mysql://localhost:85/sistemakademik");
            
        } catch (Exception e ){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal");
        }
        return null;
    }
    
}
