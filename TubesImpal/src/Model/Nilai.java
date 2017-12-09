/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Asus
 */
public class Nilai {
    
    private String namaMatkul;
    private char semesterMatkul;
    private double nilai;

    public Nilai(String namaMatkul, char semesterMatkul, double nilai) {
        this.namaMatkul = namaMatkul;
        this.semesterMatkul = semesterMatkul;
        this.nilai = nilai;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public char getSemesterMatkul() {
        return semesterMatkul;
    }

    public void setSemesterMatkul(char semesterMatkul) {
        this.semesterMatkul = semesterMatkul;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
    
    
}
