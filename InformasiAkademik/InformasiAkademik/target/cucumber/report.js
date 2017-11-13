$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/tubes/informasiakademik/test/DemoIPK.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Mengelola nilai ipk",
  "description": "Mengelola nilai ipk",
  "id": "mengelola-nilai-ipk",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 7,
  "name": "Memasukan nomor induk mahasiswa",
  "description": "",
  "id": "mengelola-nilai-ipk;memasukan-nomor-induk-mahasiswa",
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
  "name": "Nilai mahasiswa sudah dimasukkan ke sistem",
  "keyword": "Dengan "
});
formatter.step({
  "line": 9,
  "name": "Mahasiswa menyelesaikan tingkat tertentu",
  "keyword": "Ketika "
});
formatter.step({
  "line": 10,
  "name": "respon nilai ipk terakumulasi dari nilai ips",
  "keyword": "Maka "
});
formatter.match({
  "location": "DemoContext.nilai_mahasiswa_sudah_dimasukkan_ke_sistem()"
});
formatter.result({
  "duration": 162522319,
  "status": "passed"
});
formatter.match({
  "location": "DemoIPKContext.mahasiswa_menyelesaikan_tingkat_tertentu()"
});
formatter.result({
  "duration": 85767,
  "status": "passed"
});
formatter.match({
  "location": "DemoIPKContext.respon_nilai_ipk_terakumulasi_dari_nilai_ips()"
});
formatter.result({
  "duration": 30777,
  "status": "passed"
});
formatter.uri("com/tubes/informasiakademik/test/DemoTest.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Mengelola nilai ips",
  "description": "Mengelola nilai ips",
  "id": "mengelola-nilai-ips",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 7,
  "name": "Memasukan nomor induk mahasiswa",
  "description": "",
  "id": "mengelola-nilai-ips;memasukan-nomor-induk-mahasiswa",
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
  "name": "Nilai mahasiswa sudah dimasukkan ke sistem",
  "keyword": "Dengan "
});
formatter.step({
  "line": 9,
  "name": "Mahasiswa menyelesaikan semester tertentu",
  "keyword": "Ketika "
});
formatter.step({
  "line": 10,
  "name": "respon nilai ips terakumulasi",
  "keyword": "Maka "
});
formatter.match({
  "location": "DemoContext.nilai_mahasiswa_sudah_dimasukkan_ke_sistem()"
});
formatter.result({
  "duration": 31598,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.mahasiswa_menyelesaikan_semester_tertentu()"
});
formatter.result({
  "duration": 32830,
  "status": "passed"
});
formatter.match({
  "location": "DemoContext.respon_nilai_ips_terakumulasi()"
});
formatter.result({
  "duration": 34061,
  "status": "passed"
});
});