package Modul10;
import java.util.Scanner; 

public class AplikasiLampu {
	public static void main(String[] args) {
		Lampu lampu = new Lampu();
		Scanner sc = new Scanner(System.in);
		lampu.statusLampu = lampu.setSaklar(0);
		System.out.println("Status Lampu = "+lampu.statusLampu+"\nketikkan");
		System.out.println("1 untuk menyalakan lampu\n0 untuk mematikan lampu");
		
		lampu.statusLampu = sc.nextInt();
		
		if(lampu.statusLampu == 0){
			lampu.matikanLampu();
		}else{		
			lampu.hidupkanLampu();
			System.out.println("Ketikkan");
			System.out.println("2 untuk meredupkan lampu\n0 untuk mematikan lampu");
			lampu.setSaklar(sc.nextInt());
			if(lampu.statusLampu == 2){
				lampu.redupkanLampu();
			}
			else {
				lampu.matikanLampu();
			}
		}	
		
	}
}
