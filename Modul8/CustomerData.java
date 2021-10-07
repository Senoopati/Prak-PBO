package Modul8;

public class CustomerData {
	String nama,alamat,tanggalLahir,pekerjaan;
	double gaji;
	public CustomerData() {
		System.out.println("Selamat datang info Data Customer");
	}
	public CustomerData(String nama, String alamat, String tanggalLahir, String pekerjaan , double gaji) {
		this.nama = nama;
		this.alamat = alamat;
		this.tanggalLahir = tanggalLahir;
		this.pekerjaan = pekerjaan;
		this.gaji = gaji;
	}
	
	public void info() {
		System.out.println("Nama		: " + nama + "\n" +
							"Alamat		: " + alamat + "\n" + 
							"Tanggal lahir	: " + tanggalLahir + "\n" +
							"Pekerjaan	: " + pekerjaan + "\n" +
							"Gaji		: " + gaji + "\n" );
	}
	
}
