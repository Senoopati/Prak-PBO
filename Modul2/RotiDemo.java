package Modul2;

public class RotiDemo {
	public static void main(String[] args) {
	 Roti rt = new Roti();
	 rt.beriWarna("Hijau");
	 rt.beriRasa("Pandan");
	 rt.timbangBerat(30);
	 rt.hagaJual(8000);
	 rt.infoRoti();
	 
	 Roti rotee = new Roti();
	 rotee.beriWarna("Kuning");
	 rotee.beriRasa("Hazelnut");
	 rotee.timbangBerat(25);
	 rotee.hagaJual(9000);
	 rotee.infoRoti();
	 
	 Roti rti = new Roti();
	 rti.beriWarna("Putih");
	 rti.beriRasa("Susu");
	 rti.timbangBerat(35);
	 rti.hagaJual(8500);
	 rti.infoRoti();
 	}
	
}