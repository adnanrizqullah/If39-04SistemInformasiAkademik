/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GUI.MenuMhs;
import Model.Aplikasi;
import Model.Matkul;
import Model.Nilai;
import Model.UserMhs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Adnan
 */
public class ControllerMhs extends MouseAdapter implements ActionListener {
    
    private Aplikasi model;
    private MenuMhs view;
    private UserMhs model1;
    private Matkul model2;
    private ArrayList<Nilai> daftarNilai;
    

    ControllerMhs(Aplikasi model, UserMhs m) {
        daftarNilai = new ArrayList<>();
        this.model = model;
        this.view = new MenuMhs();
        view.setVisible(true);
        view.addListener(this);
        //view.getTblDaftarNilai().setModel(new DaftarNilaiTabelModel)
        view.addMouseListener(this);
        
        //view.refresh();
        //UserMhs = m;
        //view.getTblDaftarNilai().setModel(new DaftarNilaiModel(Nilai);
        view.getLabelNama().setText(MenuMhs.getNama());
        view.getLabelSemester().setText(MenuMhs.getNama());
        view.getLabelKelas().setText(MenuMhs.getNama());     
    }
    
    private String[] getDaftarNilai(){
        String[] daftar = new String[daftarNilai.size()];
        for (int i = 0; i < daftar.length; i++){
            daftar[i] = daftarNilai.get(i).getNamaMatkul();
        }
        return daftar;  
    }
    
    private Nilai getSelectedNilai(String n){
        for (Nilai o : daftarNilai){
            if (o.getNamaMatkul() == n){
                return o;
            }
        }
        return null;
    }

    public void actionPerformed(ActionEvent ae, String nilai) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnAddRegist())) {
            Nilai n = new Nilai();
            int row = view.getTblDaftarMatkul().getSelectedRow();
            n.setNamaMatkul(view.getTblDaftarMatkul().getValueAt(row, 0).toString());
            n.setNilai(Integer.parseInt(view.getTblDaftarMatkul().getValueAt(row, 1).toString()));
            n.setSemesterMatkul(view.getTblDaftarMatkul().getValueAt(row, 2).toString());
            if (model.isNilai(daftarNilai, n) == false) {
                daftarNilai.add(n);
            } else {
                JOptionPane.showMessageDialog(view, "Anda sudah menambahkan Ruangan ini");
            }
            view.refresh();
            view.getListMatkul().setListData(getDaftarNilai());
        } else if (source.equals(view.getBtnDeleteRegist())) {
            String ruangan = view.getListMatkul().getSelectedValue();
            daftarNilai.remove(getSelectedNilai(nilai));
            view.getListMatkul().setListData(getDaftarNilai());
        } else if (source.equals(view.getBtnLogout1())) {
            view.dispose();
            new Controller_Login(model);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}