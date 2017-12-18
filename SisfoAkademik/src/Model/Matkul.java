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
public class Matkul {
    
    private String kodeMatkul;
    private String namaMatkul;
    private String kodeRuangan;

    public Matkul() {
    }

    public Matkul(String kodeMatkul, String namaMatkul, String kodeRuangan) {
        this.kodeMatkul = kodeMatkul;
        this.namaMatkul = namaMatkul;
        this.kodeRuangan = kodeRuangan;
    }

    public String getKodeMatkul() {
        return kodeMatkul;
    }

    public void setKodeMatkul(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public String getKodeRuangan() {
        return kodeRuangan;
    }

    public void setKodeRuangan(String kodeRuangan) {
        this.kodeRuangan = kodeRuangan;
    }
    
    
}
