package Modul3;

public class Pegawai {
	String nama;
	int nip;
	double gaji;
	
	void infoPegawai(String nama, int nip, double gaji) {
		this.nama = nama;
		this.nip = nip;
		this.gaji = gaji;
		System.out.println( "Nama		: " + this.nama + "\n" +
							"NIP		: " + this.nip + "\n" +
							"Gaji		: " + this.gaji + "Juta" + "\n");
	}
}
