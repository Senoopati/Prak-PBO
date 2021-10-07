package Modul5;

public class Buku {
	String namaPengarang, judulBuku;
	int tahunTerbit, cetakanKe;
	double hargaJual;
	
	public Buku(String namaPengarang,String judulBuku) {
		this.namaPengarang = namaPengarang;
		this.judulBuku = judulBuku;
		System.out.println("Nama Pengarang		: " + namaPengarang + "\n"+
				"Judul Buku		: " + judulBuku + "\n");
	}
	
	public Buku(String judulbuku,int tahunterbit) {
		this.judulBuku = judulbuku;
		this.tahunTerbit = tahunterbit;
		System.out.println("Judul Buku		: " + judulBuku + "\n"+
				   "Tahun Terbit		: " + tahunTerbit + "\n" );
	}
	
	public Buku(String judulBuku,double hargaJual) {
		this.judulBuku = judulBuku;
		this.hargaJual = hargaJual;
		System.out.println("Judul Buku		: " + judulBuku + "\n"+
				   "Harga Jual		: " + hargaJual  + "\n");
	}
	
}
