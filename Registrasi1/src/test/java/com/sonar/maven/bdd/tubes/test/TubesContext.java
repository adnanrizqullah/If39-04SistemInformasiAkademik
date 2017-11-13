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
 * @author Munip
 */
public class TubesContext {
   @Dengan("^Registrasi sudah bisa dilakukan$")
public void registrasi_sudah_bisa_dilakukan() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
    boolean expectation = false;
    boolean result = false;
    Assert.assertEquals(expectation, result);
}

@Ketika("^masa registrasi dimulai dan Tim Sisfo telah melakukan validasi pembayaran terhadap mahasiswa terkait$")
public void masa_registrasi_dimulai_dan_Tim_Sisfo_telah_melakukan_validasi_pembayaran_terhadap_mahasiswa_terkait() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
    boolean expectation = false;
    boolean result = false;
    Assert.assertEquals(expectation, result);
}

@Maka("^respon Mahasiswa mendapat jadwal matakuliah wajib dalam bentuk kelas default$")
public void respon_Mahasiswa_mendapat_jadwal_matakuliah_wajib_dalam_bentuk_kelas_default() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
    boolean expectation = false;
    boolean result = false;
    Assert.assertEquals(expectation, result);
}
}
