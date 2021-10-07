package Modul9;

public class Kerucut extends bangunRuang {
	int r = 7;
	Double phi = 3.14;
	int p = phi.intValue();
	int t = 5;
	int s = 3;
	
	public int volume() {
		return  (p * (r*r) * t)/3;
	};
	
	public int luasSelimut() {
		return p * r * (r+s);
	};
}
