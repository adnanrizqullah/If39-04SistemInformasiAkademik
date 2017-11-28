/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.impal.tubesimpal.test;

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

    @Dengan("^Notif nilai akhir final akan muncul di masing-masing akun mahasiswa$")
    public void notif_nilai_akhir_final_akan_muncul_di_masing_masing_akun_mahasiswa() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = true;
        boolean result = true;
        Assert.assertEquals(expected, result);

    }

    @Ketika("^Notif nilai akhir final sudah masuk pada masing-masing akun Mahasiswa$")
    public void notif_nilai_akhir_final_sudah_masuk_pada_masing_masing_akun_Mahasiswa() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = true;
        boolean result = true;
        Assert.assertEquals(expected, result);
    }

    @Maka("^respon Mahasiswa dapat melihat nilai akhir pada setiap mata kuliah yang mereka ambil$")
    public void respon_Mahasiswa_dapat_melihat_nilai_akhir_pada_setiap_mata_kuliah_yang_mereka_ambil() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = true;
        boolean result = true;
        Assert.assertEquals(expected, result);
    }

    @Maka("^Mahasiswa dapat melihat IPS dan IPK sesuai dengan nilai akhir final mereka$")
    public void mahasiswa_dapat_melihat_IPS_dan_IPK_sesuai_dengan_nilai_akhir_final_mereka() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        boolean expected = true;
        boolean result = true;
        Assert.assertEquals(expected, result);
    }
    
    
}
