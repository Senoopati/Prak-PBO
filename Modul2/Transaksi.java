package Modul2;

public class Transaksi {
	int saldo;
	int no_rekening;
	String nama;

	void menu() {
		System.out.print("===== Selamat Datang =====" + "\n" +
				"Pilihan menu : " + "\n" +
				"1. Cek Saldo " + "\n" +
				"2. Menabung " + "\n" +
				"3. Penarikan " + "\n" +
				"4. Transfer " + "\n");
		System.out.print("Silahkan pilih menu diatas : " );	
	}
	
	void cek_saldo() {
		System.out.println("Halo " + nama + " Dengan no rek " + no_rekening +" . Saldo anda adalah : Rp " + saldo + "\n");
	}
	
	void menabung(int uang) {
		 this.saldo += uang;
		 System.out.println("Anda melakukan menabung sejumlah Rp " + uang + ". Saldo anda sekarang adalah Rp " + this.saldo + "\n");
	}
	
	String menarik(int trk) {
		return "Anda melakukan penarikan sejumalah " + trk;
	}
	
	void transfer(int tf,int tujuan ) {
		this.saldo -= tf;
		System.out.println("Anda berhasil melakukan transfer ke nomer rekening " + tujuan + " Sejumlah Rp " + tf + " . Sisa saldo anda sekarang adalah : Rp " + this.saldo);
	}
}