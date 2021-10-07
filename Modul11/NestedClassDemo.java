package Modul11;

public class NestedClassDemo {

	public static void main(String[] args) {
		NestedClass nc = new NestedClass();
		
		NestedClass.StaticNestedClass sc = new NestedClass.StaticNestedClass();
		sc.tampilalkanNama();
			
		NestedClass.InnerClass ic = nc.new InnerClass();
		ic.tampilkanJurusan();
		
	}

}
