package Modul2;

public class HewanDemo {
	public static void main(String[] args) {
		Hewan hw1 = new Hewan();
		hw1.namaHewan("Harimau");
		hw1.jumlahkaki(4);
		hw1.makanan("Daging");
		hw1.TypeHewan("Karnivora");
		System.out.println(hw1.infoHewan());
		
		Hewan hw2 = new Hewan();
		hw2.namaHewan("Kerbau");
		hw2.jumlahkaki(4);
		hw2.makanan("Rumput");
		hw2.TypeHewan("Karnivora");
		System.out.println(hw2.infoHewan());
	}
}
