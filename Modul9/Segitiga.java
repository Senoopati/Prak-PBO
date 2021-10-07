package Modul9;

public class Segitiga extends methodAbstract{
	int alas = 4 ;
	int sisimiring = 5;
	int tinggi = 7 ;
	public int luas() {
		return alas * tinggi;
	};
	
	public int keliling() {
		return alas + (2*sisimiring);
	};
}
