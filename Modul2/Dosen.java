package Modul2;

public class Dosen {
	String nama;
	int nik;
	String pendidikan;
	String tglLahir;
	
	void tampilkanNama(String namadosen, String pndkn) {
		nama = namadosen;
		pendidikan = pndkn; 
		System.out.print("Nama 		: " + nama + "\n"
						 + "Pendidikan	: " + pendidikan + "\n");
	}
	
	void tampilkanTglLahir(String tgl) {
		tglLahir = tgl;
		System.out.print("Tanggal Lahir   : " + tglLahir + "\n");
	}
	
	void tampilkanNik(int niknya) {
		nik = niknya ;
		System.out.print("NIK 		: " + nik + "\n");
	}
}
