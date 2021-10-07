package Modul9;

public class Main {

	public static void main(String[] args) {
		PersegiPanjang pp = new PersegiPanjang();
		System.out.println("Luas Persegi Panjang	: " + pp.getLuas());
		System.out.println("Keliling Persegi Panjang: " + pp.getKell() + "\n");
		
		JajarGenjang jg = new JajarGenjang();
		System.out.println("Luas Jajar Genjang	: " + jg.getLuas());
		System.out.println("Keliling Jajar Genjang	: " + jg.getKell()+ "\n");
	
		Lingkaran lg = new Lingkaran();
		System.out.println("Luas Lingkaran		: " + lg.getLuas());
		System.out.println("Keliling Lingkaran	: " + lg.getKell()+ "\n");
		
		Segitiga sgtg = new Segitiga();
		System.out.println("Luas Segitiga		: " + sgtg.getLuas());
		System.out.println("Keliling Segitiga	: " + sgtg.getKell()+ "\n");
	}

}
