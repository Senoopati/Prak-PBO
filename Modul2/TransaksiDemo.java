package Modul2;
import java.util.Scanner;

public class TransaksiDemo {
	 public static void main(String[] args) {
		Transaksi trns = new Transaksi();
		Scanner user = new Scanner(System.in);
		
		trns.saldo = 1000000;
		trns.no_rekening = 1123223412;
		trns.nama = "Senopati Madang Koro";
		System.out.println("Masukan pilihan untuk memilih menu : ");
		trns.menu();

		int mn = user.nextInt();
		if(mn == 1) {
			trns.cek_saldo();
		}else if(mn == 2) {
			System.out.println("Anda akan manabung. Silahkan masukan jumlah nominalnya : ");
			int uang = user.nextInt(); 
			trns.menabung(uang);
		}else if(mn == 3) {
			System.out.println("Anda melakukan penarikan. Silahkan masukan jumlah nominalnya : ");
			int tarik = user.nextInt(); 
			trns.menarik(tarik);
		}else if(mn == 4) {
			System.out.println("Anda akan transfer. Silahkan masukan no rekening tujuan : ");
			int tujuan = user.nextInt();
			System.out.println("Silahkan masukan jumlah nominalnya : ");
			int tf = user.nextInt();
			trns.transfer(tf,tujuan);
		}

	}
}
