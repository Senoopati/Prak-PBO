package Modul6;

public class SegitigaSamaSisi extends Segitiga{
	double sisi = 8;
	public SegitigaSamaSisi(int tinggi) {
		this.luas = 0.5 * sisi * tinggi ;
		this.keliling = 3 * sisi;
		System.out.println("== Segitiga Sama Sisi ==");
	}
}
