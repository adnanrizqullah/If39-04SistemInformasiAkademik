# language: id

Fitur: Lihat Jadwal Mahasiswa

    @Normal
    Scenario: Mahasiswa telah melakukan registrasi
    Given Jadwal sudah bisa dilihat 
    When mahasiwa telah melakukan registrasi.
    Then Mahasiswa dapat melihat jadwal matakuliah yang sudah diambil

    @Normal
    Scenario: Mahasiswa belum melakukan registrasi
    Given jadwal belum bisa dilihat
    When mahasiswa belum menyelesaikan proses registrasi
    Then Mahasiswa harus menyelesaikan proses registrasi matakuliah