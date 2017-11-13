/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubes.informasiakademik.test;

import cucumber.api.java.bm.Maka;
import cucumber.api.java.id.Ketika;
import junit.framework.Assert;

/**
 *
 * @author Munip
 */
public class DemoIPKContext {
    @Ketika("^Mahasiswa menyelesaikan tingkat tertentu$")
public void mahasiswa_menyelesaikan_tingkat_tertentu() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
    boolean expexted = false;
    boolean result = false;
    Assert.assertEquals(expexted, result);
}

@Maka("^respon nilai ipk terakumulasi dari nilai ips$")
public void respon_nilai_ipk_terakumulasi_dari_nilai_ips() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
    boolean expexted = false;
    boolean result = false;
    Assert.assertEquals(expexted, result);
}
}
