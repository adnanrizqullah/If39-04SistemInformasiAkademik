/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonar.maven.bdd.tubes;

/**
 *
 * @author Munip
 */
public class Mahasiswa {
    private String nim;
    private String semester;

    public Mahasiswa(String nim, String semester) {
        this.nim = nim;
        this.semester = semester;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    
}
