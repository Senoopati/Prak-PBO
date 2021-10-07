package Modul6;

public class Mobil extends Kendaraan {
		String Merk = "Toyota";
		String bahanBakar = "Solar";
		
		void info() {
			this.beratKendaraan = 500;
			System.out.println("Jenis Kendaraan : Mobil "+ "\n" + "Merk : " + Merk + "\n" 
			+ "Bahan Bakar : " + bahanBakar + "\n" 
			+ "Tahun : " + Tahun + "\n" );
		}
		
	
}
