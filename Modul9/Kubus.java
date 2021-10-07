package Modul9;

public class Kubus extends bangunRuang{
	int s = 3;
	
	public int volume() {
		return s*s*s;
	};
	
	public int luasSelimut() {
		return 6*(s*s);
	};
}
