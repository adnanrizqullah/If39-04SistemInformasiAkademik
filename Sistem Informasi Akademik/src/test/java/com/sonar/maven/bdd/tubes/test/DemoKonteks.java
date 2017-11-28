/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonar.maven.bdd.tubes.test;

import cucumber.api.PendingException;
import cucumber.api.java.bm.Maka;
import cucumber.api.java.id.Dengan;
import cucumber.api.java.id.Ketika;
import junit.framework.Assert;

/**
 *
 * @author acer
 */
public class DemoKonteks {

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

    @Maka("^Mahasiswa dapat melihat jadwal matakuliah yang sudah diambil$")
    public void mahasiswa_dapat_melihat_jadwal_matakuliah_yang_sudah_diambil() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = true;
        boolean result = true;
        Assert.assertEquals(expected, result);
    }

}
