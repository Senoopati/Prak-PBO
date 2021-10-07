package Modul9;

public class Balok extends bangunRuang {
	int p = 5;
	int l = 3;
	int t = 2;
	
	public int volume() {
		return p*l*t;
	};
	
	public int luasSelimut() {
		return 2*(p*l + p*t + l*t);
	};
}
