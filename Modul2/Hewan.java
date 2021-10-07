package Modul2;


public class Hewan {
	String namaHewan;
	int jmlKaki;
	String makanan;
	String typeHewan;
	
	void namaHewan(String hewan) {
		namaHewan = hewan;
	}
	
	void jumlahkaki(int jml) {
		jmlKaki = jml;
	}
	
	void makanan(String mkn) {
		makanan = mkn;
	}
	
	void TypeHewan(String jns) {
	    typeHewan = jns;
	}
	
	String infoHewan() {
		return	"Nama Hewan: " + namaHewan + "\n" +
				"Jumlah Kaki: " + Integer.toString(jmlKaki) + "\n" +
				"Makanan: " + makanan + "\n"+
				"Type Hewan: " + typeHewan + "\n";
	}
}
