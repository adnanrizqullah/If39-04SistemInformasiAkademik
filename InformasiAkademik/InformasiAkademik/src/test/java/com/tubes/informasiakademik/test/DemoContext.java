/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubes.informasiakademik.test;

import cucumber.api.java.bm.Maka;
import cucumber.api.java.id.Dengan;
import cucumber.api.java.id.Ketika;
import junit.framework.Assert;



/**
 *
 * @author Munip
 */
public class DemoContext {
    
@Dengan("^Nilai mahasiswa sudah dimasukkan ke sistem$")
public void nilai_mahasiswa_sudah_dimasukkan_ke_sistem() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
    boolean expexted = false;
    boolean result = false;
    Assert.assertEquals(expexted, result);
}
    
@Ketika("^Mahasiswa menyelesaikan semester tertentu$")
public void mahasiswa_menyelesaikan_semester_tertentu() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
    boolean expexted = false;
    boolean result = false;
    Assert.assertEquals(expexted, result);
}

@Maka("^respon nilai ips terakumulasi$")
public void respon_nilai_ips_terakumulasi() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
    boolean expexted = false;
    boolean result = false;
    Assert.assertEquals(expexted, result);
}

}
