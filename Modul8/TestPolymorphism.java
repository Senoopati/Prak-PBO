package Modul8;

public class TestPolymorphism {

	public static void main(String[] args) {
		Kucing kc = new Kucing();
		System.out.println("Kucing : " + kc.jalan());
		
		Anjing aj = new Anjing();
		System.out.println("Anjing : " + aj.jalan());
		
		Elang el = new Elang();
		System.out.println("Elang  : " + el.jalan());
	}

}
