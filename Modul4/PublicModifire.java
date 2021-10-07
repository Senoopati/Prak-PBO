package Modul4;

public class PublicModifire {
	public int a = 2;
	public int b = 5;
	public int c = 9;
	
	public void kali(){  
		int d = a*b*c;
		System.out.println("Hasil kali = "+d);
	}
	
	public void tambah() {
		int jml = a+b+c;
		System.out.println("Hasil jumlah = "+jml);
	}
	
	public void kurang() {
		int krg = a-b-c;
		System.out.println("Hasil pengurangan = "+krg);
	}
	
	public void bagi() {
		int bg=c/a;
		System.out.println("Hasil bagi = "+bg);
	}
	
	public void rata_rata() {
		float rata = (a+b+c) / 3;
		System.out.println("Hasil rata-rata = "+rata);
		
	}
}
