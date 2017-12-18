/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author Asus
 */
public class Nilai {
    
    private String namaMatkul;
    private String semesterMatkul;
    private double nilai;

    public Nilai(String namaMatkul, String semesterMatkul, double nilai) {
        this.namaMatkul = namaMatkul;
        this.semesterMatkul = semesterMatkul;
        this.nilai = nilai;
    }

    public Nilai() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Nilai(String namaMatkul, char semesterMatkul, double nilai) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public String getSemesterMatkul() {
        return semesterMatkul;
    }

    public void setSemesterMatkul(String semesterMatkul) {
        this.semesterMatkul = semesterMatkul;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
    
    
    
}
