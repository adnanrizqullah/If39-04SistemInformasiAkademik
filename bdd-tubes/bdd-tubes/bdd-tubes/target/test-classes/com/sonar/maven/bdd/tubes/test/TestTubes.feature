# language: id

Fitur: Login User
	Login User

	@Normal
	Skenario: Memasukan user ke dalam sistem 
		Dengan Username dan password user yang cocok sehingga tidak terjadi kegagalan
		Ketika Memasukkan username "alifa" dan password "azzami"
		Maka respon "login berhasil"

        @Gagal
        Skenario: Memasukkan user ke dalam sistem
                Dengan Username dan password user yang tidak cocok sehingga terjadi kegagalan
                Ketika Memasukkan username "munip" dan password "hanif"
                Maka respon gagal dengan pesan "login gagal"
