$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/sonar/maven/bdd/tubes/test/TestPembayaran.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Pembayaran Mahasiswa",
  "description": "      Pembayaran Mahasiswa",
  "id": "pembayaran-mahasiswa",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 7,
  "name": "Membayar uang semeter",
  "description": "",
  "id": "pembayaran-mahasiswa;membayar-uang-semeter",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 6,
      "name": "@Normal"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Status pembayaran belum lunas",
  "keyword": "Dengan "
});
formatter.step({
  "line": 9,
  "name": "Mahasiswa telah memasukkan kode pembayaran \"abc123\"",
  "keyword": "Ketika "
});
formatter.step({
  "line": 10,
  "name": "respon dengan pesan \"pembayaran telah dilakukan\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "PembayaranContext.status_pembayaran_belum_lunas()"
});
formatter.result({
  "duration": 113912599,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 44
    }
  ],
  "location": "PembayaranContext.mahasiswa_telah_memasukkan_kode_pembayaran(String)"
});
formatter.result({
  "duration": 7331125,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pembayaran telah dilakukan",
      "offset": 21
    }
  ],
  "location": "PembayaranContext.respon_dengan_pesan(String)"
});
formatter.result({
  "duration": 95528,
  "status": "passed"
});
formatter.uri("com/sonar/maven/bdd/tubes/test/TestTubes.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Login User",
  "description": "Login User",
  "id": "login-user",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 7,
  "name": "Memasukan user ke dalam sistem",
  "description": "",
  "id": "login-user;memasukan-user-ke-dalam-sistem",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 6,
      "name": "@Normal"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Username dan password user yang cocok sehingga tidak terjadi kegagalan",
  "keyword": "Dengan "
});
formatter.step({
  "line": 9,
  "name": "Memasukkan username \"alifa\" dan password \"azzami\"",
  "keyword": "Ketika "
});
formatter.step({
  "line": 10,
  "name": "respon \"login berhasil\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "TubesContext.username_dan_password_user_yang_cocok_sehingga_tidak_terjadi_kegagalan()"
});
formatter.result({
  "duration": 1941524,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "alifa",
      "offset": 21
    },
    {
      "val": "azzami",
      "offset": 42
    }
  ],
  "location": "TubesContext.memasukkan_username_dan_password(String,String)"
});
formatter.result({
  "duration": 90620,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "login berhasil",
      "offset": 8
    }
  ],
  "location": "TubesContext.respon(String)"
});
formatter.result({
  "duration": 69852,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Memasukkan user ke dalam sistem",
  "description": "",
  "id": "login-user;memasukkan-user-ke-dalam-sistem",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 12,
      "name": "@Gagal"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Username dan password user yang tidak cocok sehingga terjadi kegagalan",
  "keyword": "Dengan "
});
formatter.step({
  "line": 15,
  "name": "Memasukkan username \"munip\" dan password \"hanif\"",
  "keyword": "Ketika "
});
formatter.step({
  "line": 16,
  "name": "respon gagal dengan pesan \"login gagal\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "TubesContext.username_dan_password_user_yang_tidak_cocok_sehingga_terjadi_kegagalan()"
});
formatter.result({
  "duration": 59281,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "munip",
      "offset": 21
    },
    {
      "val": "hanif",
      "offset": 42
    }
  ],
  "location": "TubesContext.memasukkan_username_dan_password(String,String)"
});
formatter.result({
  "duration": 87599,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "login gagal",
      "offset": 27
    }
  ],
  "location": "TubesContext.respon_gagal_dengan_pesan(String)"
});
formatter.result({
  "duration": 92507,
  "status": "passed"
});
});