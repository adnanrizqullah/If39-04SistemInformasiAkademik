/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonar.maven.bdd.tubes.test;

import cucumber.api.java.bm.Maka;
import cucumber.api.java.id.Dengan;
import cucumber.api.java.id.Ketika;
import junit.framework.Assert;

public class PembayaranContext {
    
    @Dengan("^Status pembayaran belum lunas$")
public void status_pembayaran_belum_lunas() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
    boolean expexted = false;
    boolean result = false;
    Assert.assertEquals(expexted, result);
}

@Ketika("^Mahasiswa telah memasukkan kode pembayaran \"([^\"]*)\"$")
public void mahasiswa_telah_memasukkan_kode_pembayaran(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
    boolean expexted = false;
    boolean result = false;
    Assert.assertEquals(expexted, result);
}

@Maka("^respon dengan pesan \"([^\"]*)\"$")
public void respon_dengan_pesan(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
    String result = "pembayaran telah dilakukan";
    Assert.assertEquals(arg1, result);
}

}
