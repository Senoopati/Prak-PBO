package Modul6;

public class PersegiPanjang extends BangunDatar{
	int panjang = 4;
	double lebar = 3;
	public PersegiPanjang() {
		this.luas = panjang * lebar ;
		this.keliling = 2*(panjang + lebar);
		System.out.println("== Persegi Panjang ==");
	}
}
