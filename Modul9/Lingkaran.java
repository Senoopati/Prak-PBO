package Modul9;

public class Lingkaran extends methodAbstract{
	Double jarijari = 7.44;
	int r = jarijari.intValue();
	Double phi = 3.14;
	int p = phi.intValue();
	
	public int luas() {
		return p * (r * r);
	};
	
	public int keliling() {
		return 2*p*r;
	};
}
