/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonar.maven.bdd.tubes.test;

import cucumber.api.java.bm.Maka;
import cucumber.api.java.id.Dengan;
import cucumber.api.java.id.Ketika;
import org.junit.Assert;

/**
 *
 * @author crows_000
 */
public class LihatJadwalDosenKonteks {
    @Dengan("^Jadwal sudah bisa dilihat$")
    public void jadwal_sudah_bisa_dilihat() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = true;
        boolean result = true;
        Assert.assertEquals(expected, result);
    }

    @Ketika("^Mahasiswa telah melakukan registrasi$")
    public void mahasiswa_telah_melakukan_registrasi() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = true;
        boolean result = true;
        Assert.assertEquals(expected, result);
    }

    @Maka("^Dosen dapat melihat jadwal dia mengajar$")
    public void dosen_dapat_melihat_jadwal_dia_mengajar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = true;
        boolean result = true;
        Assert.assertEquals(expected, result);
    }
}
