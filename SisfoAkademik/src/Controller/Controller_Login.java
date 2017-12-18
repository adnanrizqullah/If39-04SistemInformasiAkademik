/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GUI.GUI_Login;
import Model.Aplikasi;
import Model.Jadwal;
import Model.Kelas;
import Model.UserDsn;
import Model.UserMhs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Alifa Nur Azzami
 */
public class Controller_Login implements ActionListener{
    private Aplikasi model;    

    private GUI_Login GUI;
    private UserDsn model1;
    private UserMhs model2;
    private Kelas model3;
    private Jadwal model4;
    
    public Controller_Login(Aplikasi model){
        this.model = model;
        GUI = new GUI_Login();
        GUI.setVisible(true);
        GUI.addListener(this);
    }

    public Controller_Login() {
    }

    
    @Override
    public void actionPerformed(ActionEvent ae) {
       Object source = ae.getSource();
       if (source.equals(GUI.getbtn_login())){
           JOptionPane.showMessageDialog(null, "Maaf untuk pengujian running belum siap, dikarenakan database belum siap");
           if (GUI.getUsername().equals("") || GUI.getPassword().equals("")){
               JOptionPane.showMessageDialog(null, "Semua data harus terisi");
           }else{
               String username = GUI.getUsername();
               String password = GUI.getPassword();
               if (model.LoginMhs(username, password) != null){
                   UserMhs m = model.LoginMhs(username, password);
                   JOptionPane.showMessageDialog(GUI, "Anda berhasil login");
                   new ControllerMhs(model, m);
                   GUI.dispose();
               }else if (model.LoginDsn(username, password) != null){
                   UserDsn d = model.LoginDsn(username, password);
                   JOptionPane.showMessageDialog(GUI, "Anda berhasil login");
                   new ControllerDosen(model, d);
                   GUI.dispose();
               }else{
                   JOptionPane.showMessageDialog(GUI, "Username atau password salah");
               
               }
               GUI.refresh();
           }
       }
    }
}