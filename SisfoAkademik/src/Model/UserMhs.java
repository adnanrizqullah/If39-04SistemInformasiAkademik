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
public class UserMhs {
    
    private String uname, pass;
    private String namaMhs;
    private String nim;
    private String semesterMhs;
    private String idkelasMhs;
    private String fakultas;
    private String jurusan;
    private List<Nilai> listNilai;

    public UserMhs(String uname, String pass, String namaMhs, String semesterMhs, String idkelasMhs, String fakultas, String jurusan) {
        this.uname = uname;
        this.pass = pass;
        this.namaMhs = namaMhs;
        this.semesterMhs = semesterMhs;
        this.idkelasMhs = idkelasMhs;
        this.fakultas = fakultas;
        this.jurusan = jurusan;
        this.listNilai = new ArrayList<>();
    }

    public void createNilai(String namaMatkul, char semesterMatkul, double nilai) {
        listNilai.add(new Nilai(namaMatkul, semesterMatkul, nilai));
    }

    public Nilai getDaftarNilai(int i) {
        return listNilai.get(i);
    }
    public UserMhs() {
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

    public String getNamaMhs() {
        return namaMhs;
    }

    public void setNamaMhs(String namaMhs) {
        this.namaMhs = namaMhs;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getSemesterMhs() {
        return semesterMhs;
    }

    public void setSemesterMhs(String semesterMhs) {
        this.semesterMhs = semesterMhs;
    }

    public String getIdkelasMhs() {
        return idkelasMhs;
    }

    public void setIdkelasMhs(String idkelasMhs) {
        this.idkelasMhs = idkelasMhs;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

   
    
    
}
