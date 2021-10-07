package Modul6;

public class Pesawat extends Kendaraan {
		int KapasitasPenumpang = 150;
		String bahanBakar = "Avtur";
		
		void info() {
			System.out.println("Jenis Kendaraan : Pesawat "+ "\n" + "Kapasitas Penumpang : " + KapasitasPenumpang 
					+ " Orang "+ "\n" + "Bahan Bakar : " + bahanBakar
					+ "\n" + "Berat Kendaraan : " + super.beratKendaraan + " Kg" + "\n" );
		}
}
