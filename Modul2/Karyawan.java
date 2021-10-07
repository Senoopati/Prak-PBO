package Modul2;

public class Karyawan {
	String nama;
	String alamat;
	String jabatan;
	double gaji;
	
	void tampilkanNama(String namaa) {
		nama = namaa;
		System.out.println("Nama 	: " + nama );
	}
	
	void tampilkanJabatan(String jbtn) {
		jabatan = jbtn;
		System.out.println("Jabatan : " + jabatan );
	}
	
	void tampilkanAlamat(String almt) {
		alamat = almt;
		System.out.println("Alamat 	: " + alamat );
	}
	
	void tampilkanGaji(double gj) {
		gaji = gj;
		System.out.println("Gaji 	: " + gaji + " $");
	}
	
}
