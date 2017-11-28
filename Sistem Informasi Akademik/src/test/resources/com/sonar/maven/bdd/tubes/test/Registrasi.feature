# language: id

Fitur: Registrasi Matakuliah
	Registrasi Matakuliah

	@TerpenuhiSyarat
	Skenario: Pembayaran telah tervalidasi
		Dengan Registrasi sudah bisa dilakukan
		Ketika masa registrasi dimulai dan Tim Sisfo telah melakukan validasi pembayaran terhadap mahasiswa terkait
		Maka respon Mahasiswa mendapat jadwal matakuliah wajib dalam bentuk kelas default
                Dan Mahasiswa dapat memilih matkuliah pilihan sesuai semester yang sedang ditempuhnya
        
        @BelumPembayaran
        Skenario: Pembayaran belum tervalidasi
                Dengan Registrasi belum bisa dilakukan
                Ketika masa registrasi dimulai dan Tim Sisfo telah belum melakukan validasi pembayaran terhadap mahasiswa terkait
                Maka respon Mahasiswa menunggu validasi pembayaran
     
        @BelumMasaRegis
        Scenario: Masa registrasi belum dimulai 
                Dengan Registrasi belum bisa dilakukan
                Ketika masa registrasi belum dimulai
                Maka respon Mahasiswa menunggu masa registrasi

                    
                               

        