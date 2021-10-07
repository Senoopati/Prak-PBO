package Modul2;

public class Roti {
	String warna;
	String rasa;
	int berat;
	double HargaJual;
 
	void beriWarna(String warnaRoti) {
		warna = warnaRoti;
	}
	
	void beriRasa(String rasaRoti) {
		rasa = rasaRoti;
	}
	
	void timbangBerat(int beratRoti) {
		berat = beratRoti;
	}
	
	void hagaJual(double jual) {
		HargaJual = jual;
	}
	
	void infoRoti() {
		System.out.println(
			 " Warna Roti : " + warna + "\n" +
			 " Rasa Roti : " + rasa + "\n" +
			 " Berat Roti : " + berat + " gr " + "\n" + 
			 " Harga Roti : " + HargaJual + "\n" 
			 );
	 		
	}
 
}
