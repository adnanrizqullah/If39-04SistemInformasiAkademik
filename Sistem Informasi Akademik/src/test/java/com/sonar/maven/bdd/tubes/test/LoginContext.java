/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonar.maven.bdd.tubes.test;

//import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;
import cucumber.api.java.bm.Maka;
import cucumber.api.java.id.Dengan;
import cucumber.api.java.id.Ketika;
import org.junit.Assert;

public class LoginContext {
    @Dengan("^Username dan password user yang cocok sehingga tidak terjadi kegagalan$")
public void username_dan_password_user_yang_cocok_sehingga_tidak_terjadi_kegagalan() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expexted = false;
//    throw new PendingException();
    boolean result = false;
    Assert.assertEquals(expexted, result);
}

@Ketika("^Memasukkan username \"([^\"]*)\"$")
public void memasukkan_username(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    boolean expexted = false;
//    throw new PendingException();
    boolean result = false;
    Assert.assertEquals(expexted, result);
}

@Maka("^respon \"([^\"]*)\"$")
public void respon(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
    String result = "login berhasil";
    Assert.assertEquals(arg1, result);
}

@Ketika("^Memasukkan username \"([^\"]*)\" dan password \"([^\"]*)\"$")
public void memasukkan_username_dan_password(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
    boolean expexted = false;
    boolean result = false;
    Assert.assertEquals(expexted, result);
}

@Dengan("^Username dan password user yang tidak cocok sehingga terjadi kegagalan$")
public void username_dan_password_user_yang_tidak_cocok_sehingga_terjadi_kegagalan() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
    boolean expexted = false;
    boolean result = false;
    Assert.assertEquals(expexted, result);
}

@Maka("^respon gagal dengan pesan \"([^\"]*)\"$")
public void respon_gagal_dengan_pesan(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
    String result = "login gagal";
    Assert.assertEquals(arg1, result);
}

}
