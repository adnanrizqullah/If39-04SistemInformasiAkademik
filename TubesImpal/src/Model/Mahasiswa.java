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
public class Mahasiswa extends User{
    
    private String namaMhs;
    private String nim;
    private String semesterMhs;
    private String idkelasMhs;
    private String fakultas;
    private String jurusan;
    private List<Nilai> listNilai;

    public Mahasiswa(String namaMhs, String nim, String semesterMhs, String kelasMhs, String username, String password
            , String jurusan, String fakultas) {
        super(username, password);
        this.namaMhs = namaMhs;
        this.nim = nim;
        this.semesterMhs = semesterMhs;
        this.idkelasMhs = kelasMhs;
        this.fakultas = fakultas;
        this.jurusan = jurusan;
        this.listNilai = new ArrayList<>();
    }

   
    
    public Mahasiswa(){
        
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

    public String getKelasMhs() {
        return idkelasMhs;
    }

    public void setKelasMhs(String kelasMhs) {
        this.idkelasMhs = kelasMhs;
    }

    
    
    public void createPeminjaman(String namaMatkul, char semesterMatkul, double nilai) {
        listNilai.add(new Nilai(namaMatkul, semesterMatkul, nilai));
    }

    public Nilai getDaftarPeminjaman(int i) {
        return listNilai.get(i);
    }
    
    
    
    
}
