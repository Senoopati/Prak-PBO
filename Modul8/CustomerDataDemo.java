package Modul8;

public class CustomerDataDemo {

	public static void main(String[] args) {
		CustomerData cd = new CustomerData();
		CustomerData cd1 = new CustomerData("Seno","Jl. Rajawali V no 1A", "10 Agustus 1999","BUMS", 7.5);
		CustomerData cd2 = new CustomerData("Aji","Jl. Kakak Tua no 2", "28 Agustus 1987","BUMS", 7.5);
		CustomerData cd3 = new CustomerData("Agus","Jl. Rajawali VI no 13A", "13 April 1991", "BUMN", 8.3);
		CustomerData cd4 = new CustomerData("Anton","Jl. Elang no 1", "3 Juni 1985","Dosen", 7.9);
		CustomerData cd5 = new CustomerData("Bambang","Jl. Sawo no 12", "11 April 1981","Staff", 6.8);
		CustomerData cd6 = new CustomerData("Eko","Jl. Semangka no 34", "10 Desember 1990","Wirausaha", 10.9);
		CustomerData cd7 = new CustomerData("Ahay","Jl. Salak no 2", "10 Desember 1990","Petani", 4.9);
		CustomerData cd8 = new CustomerData("Yudi","Jl. Dara V no 1", "3 Desember 1994", "BUMN", 8.3);
		CustomerData cd9 = new CustomerData("Eko","Jl. Cendrawasih no 8", "1 Agustus 1995", "BUMN", 8.3);
		CustomerData cd10 = new CustomerData("Sutomo","Jl. Elang II no 22", "3 Januari 1999", "BUMN", 8.3);
		
		cd1.info();
		cd2.info();
		cd3.info();
		cd4.info();
		cd5.info();
		cd6.info();
		cd7.info();
		cd8.info();
		cd9.info();
		cd10.info();
	}
}
