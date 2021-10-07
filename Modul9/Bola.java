package Modul9;

public class Bola extends bangunRuang {
	int r = 7;
	Double phi = 3.14;
	int p = phi.intValue();
	
	public int volume() {
		return 4/3 * p * (r*r*r);
	};
	
	public int luasSelimut() {
		return 4*p*(r*r);
	};
}
