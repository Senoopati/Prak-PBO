package Modul9;

public class demoBangunRuang {
	public static void main(String[] args) {
		Balok blk = new Balok();
		Kubus kb = new Kubus();
		Bola bl = new Bola();
		Kerucut krct = new Kerucut();
		PrismaSegitiga ps = new PrismaSegitiga();
		
		System.out.println("Volume Balok		= " + blk.getVolume());
		System.out.println("Luas Permukaan Balok	= "+blk.getLuasSelimut() + "\n");

		System.out.println("Volume Kubus		= " + kb.getVolume());
		System.out.println("Luas Permukaan Kubus	= "+kb.getLuasSelimut() + "\n");

		System.out.println("Volume Bola		= " + bl.getVolume());
		System.out.println("Luas Permukaan Bola	= "+bl.getLuasSelimut() + "\n");

		System.out.println("Volume Kerucut		= " + krct.getVolume());
		System.out.println("Luas Permukaan Kerucut	= "+krct.getLuasSelimut() + "\n");

		System.out.println("Volume Prisma Segitiga	= " + ps.getVolume());
		System.out.println("Luas Permukaan Prisma Segitiga	= "+ps.getLuasSelimut() + "\n");
		
	}
}
