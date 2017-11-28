# language: id

Fitur: Lihat Nilai Akhir Mahasiswa

    @NilaiSudahMasuk
    Skenario: Nilai Akhir Mahasiswa Sudah Final dan Sudah Dihitung IPK dan IPS Masing-masing Mahasiswa Tersebut
        Dengan Notif nilai akhir final akan muncul di masing-masing akun mahasiswa
        Ketika Notif nilai akhir final sudah masuk pada masing-masing akun Mahasiswa
        Maka respon Mahasiswa dapat melihat nilai akhir pada setiap mata kuliah yang mereka ambil
        Dan Mahasiswa dapat melihat IPS dan IPK sesuai dengan nilai akhir final mereka 

    @NilaiBelumMasuk
    Skenario: Nilai Akhir Mahasiswa Belum Final
        Dengan Notif nilai akhir final tidak akan muncul di masing-masing akun mahasiswa
        Ketika Notif nilai akhir final belum masuk ke masing-masing akun Mahasiswa
        Maka respon Mahasiswa menunggu notif nilai akhir final masuk

