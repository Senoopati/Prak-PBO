package Modul11;

public class NestedClass {
	String nama = "Senopati Bekti Wicaksono"; 
	String nim ="L200190143"; 
	
	public void printNama(){
		System.out.println(nama+" "+nim);
	}
	
	static class StaticNestedClass {
		static String jurusan = "informatika";
		
		NestedClass nc = new NestedClass();
		void tampilalkanNama() {
			nc.printNama();
		}
	
	}
	class InnerClass{
		NestedClass.StaticNestedClass ns = new NestedClass.StaticNestedClass();
		
		void tampilkanJurusan() {
			System.out.println("Jurusan : " + ns.jurusan);
		}
	}
}
