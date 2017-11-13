$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("id/impal/tubesimpal/test/Tubes.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Lihat Jadwal Mahasiswa",
  "description": "",
  "id": "lihat-jadwal-mahasiswa",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 6,
  "name": "Mahasiswa telah melakukan registrasi",
  "description": "",
  "id": "lihat-jadwal-mahasiswa;mahasiswa-telah-melakukan-registrasi",
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
  "name": "Jadwal sudah bisa dilihat",
  "keyword": "Dengan "
});
formatter.step({
  "line": 8,
  "name": "Mahasiswa telah melakukan registrasi",
  "keyword": "Ketika "
});
formatter.step({
  "line": 9,
  "name": "Mahasiswa dapat melihat jadwal matakuliah yang sudah diambil",
  "keyword": "Maka "
});
formatter.match({
  "location": "DemoKonteks.jadwal_sudah_bisa_dilihat()"
});
formatter.result({
  "duration": 477228284,
  "status": "passed"
});
formatter.match({
  "location": "DemoKonteks.mahasiswa_telah_melakukan_registrasi()"
});
formatter.result({
  "duration": 37381,
  "status": "passed"
});
formatter.match({
  "location": "DemoKonteks.mahasiswa_dapat_melihat_jadwal_matakuliah_yang_sudah_diambil()"
});
formatter.result({
  "duration": 46442,
  "status": "passed"
});
});