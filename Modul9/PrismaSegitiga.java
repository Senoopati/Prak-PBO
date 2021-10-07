package Modul9;

public class PrismaSegitiga extends bangunRuang{
	int as = 7;
	int ts = 5;
	int tp = 9;
	Double c = Math.sqrt((as*as) + (ts*ts));
	int miring = c.intValue();
	
	public int volume() {
		return ((as*ts)/2)*tp;
	};
	
	public int luasSelimut() {
		return tp * (miring+as+ts) + (2*((as*ts)/2));
	};
}
