$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/sonar/maven/bdd/tubes/test/TestTubes.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Registrasi Matakuliah",
  "description": "Registrasi Matakuliah",
  "id": "registrasi-matakuliah",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 7,
  "name": "Pembayaran telah tervalidasi",
  "description": "",
  "id": "registrasi-matakuliah;pembayaran-telah-tervalidasi",
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
  "name": "Registrasi sudah bisa dilakukan",
  "keyword": "Dengan "
});
formatter.step({
  "line": 9,
  "name": "masa registrasi dimulai dan Tim Sisfo telah melakukan validasi pembayaran terhadap mahasiswa terkait",
  "keyword": "Ketika "
});
formatter.step({
  "line": 10,
  "name": "respon Mahasiswa mendapat jadwal matakuliah wajib dalam bentuk kelas default",
  "keyword": "Maka "
});
formatter.match({
  "location": "TubesContext.registrasi_sudah_bisa_dilakukan()"
});
formatter.result({
  "duration": 151712064,
  "status": "passed"
});
formatter.match({
  "location": "TubesContext.masa_registrasi_dimulai_dan_Tim_Sisfo_telah_melakukan_validasi_pembayaran_terhadap_mahasiswa_terkait()"
});
formatter.result({
  "duration": 34881,
  "status": "passed"
});
formatter.match({
  "location": "TubesContext.respon_Mahasiswa_mendapat_jadwal_matakuliah_wajib_dalam_bentuk_kelas_default()"
});
formatter.result({
  "duration": 27905,
  "status": "passed"
});
});