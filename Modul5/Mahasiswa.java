package Modul5;

public class Mahasiswa {
	String nama  = "Senopati Bekti W" ;
	String fakultas = "FKI" ;
	int umur; 
	String alamat = "Jalan Sri Widodo no 16 Kota Madiun";
	String asalKota;
	String prodi;

	public Mahasiswa() {
		System.out.println( " =====||| Biodata mahasiswa ||| ===== " + "\n" +
    			"Nama 			 : " + nama + "\n" +
    			"Fakultas		 : " + fakultas + "\n" + 
    			"Alamat			 : " + alamat + "\n") ;
	}
	
	public Mahasiswa(String nama, String asalKota , int umur , String prodi) {
		this.nama = nama;
		this.asalKota = asalKota;
		this.umur = umur;
		this.prodi = prodi;
		}
	
	public void info() {
		System.out.println( " _____ Informasi mahasiswa _____ " + "\n" +
    			"Nama 			 : " + nama + "\n" +
    			"Asal Kota		 : " + asalKota + "\n" + 
    			"Prodi		   	 : " + prodi + "\n" + 
    			"Umur			 : " + umur + "\n") ;
	}
}
