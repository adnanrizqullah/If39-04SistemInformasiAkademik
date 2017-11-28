# language: id

Fitur: Lihat Jadwal Dosen

    @Normal
    Scenario: Mahasiswa telah melakukan registrasi
    Given Jadwal sudah bisa dilihat 
    When mahasiwa telah melakukan registrasi
    And waktu registrasi mata kuliah
    Then Dosen dapat melihat jadwal dia mengajar

    @Normal
    Scenario: Mahasiswa belum melakukan registrasi
    Given jadwal belum bisa dilihat
    When mahasiswa belum menyelesaikan proses registrasi
    And waktu registrasi matakuliah belum selesai
    Then Dosen harus menunggu mahasiswa melakukan proses registrasi matakuliah
    And Menunggu waktu registrasi matakuliah selesai 