$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("id/impal/tubesimpal/test/Tubes.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Lihat Nilai Akhir Mahasiswa",
  "description": "",
  "id": "lihat-nilai-akhir-mahasiswa",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 6,
  "name": "Nilai Akhir Mahasiswa Sudah Final dan Sudah Dihitung IPK dan IPS Masing-masing Mahasiswa Tersebut",
  "description": "",
  "id": "lihat-nilai-akhir-mahasiswa;nilai-akhir-mahasiswa-sudah-final-dan-sudah-dihitung-ipk-dan-ips-masing-masing-mahasiswa-tersebut",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 5,
      "name": "@Normal"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Notif nilai akhir final akan muncul di masing-masing akun mahasiswa",
  "keyword": "Dengan "
});
formatter.step({
  "line": 8,
  "name": "Notif nilai akhir final sudah masuk pada masing-masing akun Mahasiswa",
  "keyword": "Ketika "
});
formatter.step({
  "line": 9,
  "name": "respon Mahasiswa dapat melihat nilai akhir pada setiap mata kuliah yang mereka ambil",
  "keyword": "Maka "
});
formatter.step({
  "line": 10,
  "name": "Mahasiswa dapat melihat IPS dan IPK sesuai dengan nilai akhir final mereka",
  "keyword": "Dan "
});
formatter.match({
  "location": "DemoKonteks.notif_nilai_akhir_final_akan_muncul_di_masing_masing_akun_mahasiswa()"
});
formatter.result({
  "duration": 103090499,
  "status": "passed"
});
formatter.match({
  "location": "DemoKonteks.notif_nilai_akhir_final_sudah_masuk_pada_masing_masing_akun_Mahasiswa()"
});
formatter.result({
  "duration": 55127,
  "status": "passed"
});
formatter.match({
  "location": "DemoKonteks.respon_Mahasiswa_dapat_melihat_nilai_akhir_pada_setiap_mata_kuliah_yang_mereka_ambil()"
});
formatter.result({
  "duration": 29074,
  "status": "passed"
});
formatter.match({
  "location": "DemoKonteks.mahasiswa_dapat_melihat_IPS_dan_IPK_sesuai_dengan_nilai_akhir_final_mereka()"
});
formatter.result({
  "duration": 24165,
  "status": "passed"
});
});