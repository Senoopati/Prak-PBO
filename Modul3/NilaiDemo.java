package Modul3;
public class NilaiDemo {

	public static void main(String[] args) {
		Nilai nl = new Nilai();
		nl.nilaiTugas(83);
		nl.nilaiUts(85);
		nl.nilaiUAS(91);
		System.out.println("Nilai Total		: " + nl.totalNilai() );
	}
}
