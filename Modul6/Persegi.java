package Modul6;

public class Persegi extends BangunDatar {
	double sisi = 3;
	public Persegi() {
		this.luas = sisi * sisi;
		this.keliling = 4 * sisi;
		System.out.println("== Persegi ==");
	}
}
