package Modul9;

public class PersegiPanjang extends methodAbstract {
	int panjang = 3 ;
	int lebar = 2 ;
	public int luas() {
		return panjang * lebar;
	};
	
	public int keliling() {
		return 2*panjang + 2*lebar;
	};
	
}
