/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alifa Nur Azzami
 */
public class UserDsn {
    private String uname, pass;
    private String namaDosen;
    private String nipDosen;
    private List<Kelas> listKelas;

    public UserDsn(String uname, String pass, String namaDosen, String nipDosen) {
        this.uname = uname;
        this.pass = pass;
        this.namaDosen = namaDosen;
        this.nipDosen = nipDosen;
        this.listKelas = new ArrayList<>();
    }

    public UserDsn() {
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getNipDosen() {
        return nipDosen;
    }

    public void setNipDosen(String nipDosen) {
        this.nipDosen = nipDosen;
    }
    
    public Kelas getListKelas(int i) {
        return listKelas.get(i);
    }

    public void createKelas(String idKelas, String jurusan, String fakultas) {
        listKelas.add(new Kelas(idKelas, jurusan, fakultas));
    }

    
    
    
}
