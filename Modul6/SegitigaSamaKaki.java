package Modul6;

public class SegitigaSamaKaki extends Segitiga{
	public double sisiMiring = 5;
	
	public SegitigaSamaKaki(int tinggi) {
		this.luas = 0.5 * alas * tinggi ;
		this.keliling = alas + 2*sisiMiring;
		System.out.println("== Segitiga Sama Kaki ==");
	}
}
