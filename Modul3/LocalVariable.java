package Modul3;

public class LocalVariable {
	int umur;
	
	public void hitungUsia() {
		int usia = 0;
		int tahunSekarang = 2019;
		int tahunLahir = 1993;
		
		usia = tahunSekarang - tahunLahir;
		umur = usia;
		System.out.println("Usia saya 	: " + umur);
	}
	
	void beratBadan() {
		int beratLahir = 3;
		int beratBadan = beratLahir + (umur/2);
		
		System.out.println("Berat Badan	: " + beratBadan);
	}	
}
