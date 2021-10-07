package Modul9;

public class JajarGenjang extends methodAbstract{
	int sisiatas = 5 ;
	int sisibawah = 6;
	int tinggi = 2 ;
	public int luas() {
		return sisibawah * tinggi;
	};
	
	public int keliling() {
		return 2*(sisiatas+sisibawah);
	};
}
