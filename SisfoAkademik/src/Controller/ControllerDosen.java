/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GUI.MenuDsn;
import GUI.MenuMhs;
import Model.Aplikasi;
import Model.Jadwal;
import Model.UserDsn;
import Model.UserMhs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alifa Nur Azzami
 */
public class ControllerDosen extends MouseAdapter implements ActionListener {

    private Aplikasi model;
    private MenuDsn view;
    private UserDsn model1;
    private UserMhs model2;
    
    public ControllerDosen(Aplikasi model, UserDsn pea) {
        
        this.model = model;
        this.model1 = pea;
        this.view = new MenuDsn();
        view.setVisible(true);
        view.addListener(this);
        // update tabel
        view.addMouseListener(this);
        
        view.refresh();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnLogout())){
            new Controller_Login(model);
            view.dispose();
        }
        else {
            if (view.getJtextnama().equals("") || view.getJtextnim().equals("")
                    || view.getJtextnilaimhs().equals("")) {
                JOptionPane.showMessageDialog(view, "Semua Data Harus Terisi Semua");
            }
            String nama = view.getJtextnama().getText();
            String nim  = view.getJtextnim().getText();
            String smt = (String) view.getjComboBoxsemester().getSelectedItem();
            String mtkuli = (String) view.getjComboBoxmatkul().getSelectedItem();
            String nilai= view.getJtextnilaimhs().getText();
            JOptionPane.showMessageDialog(view, "Fitur Upload belum tersedia 1.0");    
        }
    }

    
    
}
