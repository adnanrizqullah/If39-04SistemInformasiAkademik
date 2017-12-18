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
 * @author Asus
 */
public class Kelas {
    
    private String idKelas;
    private String Jurusan;
    private String Fakultas;
    private List<UserMhs> listMhs;
    private List<Kelas>

    public Kelas(String idKelas, String Jurusan, String Fakultas) {
        this.idKelas = idKelas;
        this.Jurusan = Jurusan;
        this.Fakultas = Fakultas;
        this.listMhs = new ArrayList<>();
    }

    public Kelas() {
        
    }

    public void createMahasiswa(String uname, String pass, String namaMhs, 
            String semesterMhs, String idkelasMhs, String fakultas, String jurusan) {
        listMhs.add(new UserMhs(uname, pass, namaMhs, semesterMhs, idkelasMhs
                , fakultas, jurusan));
    }

    public UserMhs getDaftarMahasiswa(int i) {
        return listMhs.get(i);
    }
    public String getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(String idKelas) {
        this.idKelas = idKelas;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }

    public String getFakultas() {
        return Fakultas;
    }

    public void setFakultas(String Fakultas) {
        this.Fakultas = Fakultas;
    }
    
    
    
    
}
