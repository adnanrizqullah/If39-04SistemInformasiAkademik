/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Munip
 */
public class Koneksi {
     public void StartKoneksi(GUI.GUI_DokumentasiNilai1 gui) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            gui.con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/sistekakademik","root","");
            System.out.println("Koneksi ke MySQL Server berhasil!");
        }catch(ClassNotFoundException eclass){
            System.out.println("Driver tidak ada!");
        }catch(SQLException esql){
            System.out.println(esql.getMessage());
        }
  
}
}
