/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GUI.GUI_DokumentasiNilai1;
import com.sonar.maven.bdd.tubes.Mahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JOptionPane;

/**
 *
 * @author Munip
 */
public class Controller_dokumentasi extends MouseAdapter implements ActionListener {

    private Mahasiswa mahasiswa = null;
    private GUI_DokumentasiNilai1 gui;

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = (Object) ae.getSource();
        if (source.equals(gui.getBtnbatal())) {
            int answer = JOptionPane.showConfirmDialog(gui, "Anda berhasil membatalkan pilihan");

        }

    }
}
