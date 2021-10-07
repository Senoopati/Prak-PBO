package Modul7;

public class Main {
	public static void main(String[] args) {
		Manager mg1 = new Manager();
		mg1.setNama("Brandon");
		mg1.setUsia(43);
		mg1.setGaji(7.35f);
		mg1.setjamKerja(1);
		
		Manager mg2 = new Manager();
		mg2.setNama("Michael");
		mg2.setUsia(45);
		mg2.setGaji(6.8f);
		mg2.setjamKerja(3);

		Manager mg3 = new Manager();
		mg3.setNama("Bambang");
		mg3.setUsia(41);
		mg3.setGaji(7.7f);
		mg3.setjamKerja(1);
		
		Manager mg4 = new Manager();
		mg4.setNama("Jon");
		mg4.setUsia(48);
		mg4.setGaji(9.5f);
		mg4.setjamKerja(1);
		
		Manager mg5 = new Manager();
		mg5.setNama("Budi");
		mg5.setUsia(40);
		mg5.setGaji(8.9f);
		mg5.setjamKerja(4);
		
		System.out.println(" === Informasi data diri Karyawan PT. Bismillah Berkah === " + "\n" +
				"Nama		: " + mg1.getNama() + "\n" +
				"Jabatan		: Manager " + "\n" +	
				"Usia		: " + mg1.getUsia() + "\n" + 
				"Gaji		: " + mg1.getGajiManager() + " Juta " + "\n" +
				"Jam Kerja	: " + mg1.getjamKerja() + " Jam" + "\n" ); 
		
		System.out.println(" === Informasi data diri Karyawan PT. Bismillah Berkah === " + "\n" +
				"Nama		: " + mg2.getNama() + "\n" +
				"Jabatan		: Kepala Bagian" + "\n" +
				"Usia		: " + mg2.getUsia() + "\n" + 
				"Gaji		: " + mg2.getGaji() + " Juta " + "\n" +
				"Jam Kerja	: " + mg2.getjamKerja() + " Jam" + "\n" ); 
		
		System.out.println(" === Informasi data diri Karyawan PT. Bismillah Berkah === " + "\n" +
				"Nama		: " + mg3.getNama() + "\n" +
				"Jabatan		: Manager " + "\n" +
				"Usia		: " + mg3.getUsia() + "\n" + 
				"Gaji		: " + mg3.getGajiManager() + " Juta " + "\n" +
				"Jam Kerja	: " + mg3.getjamKerja() + " Jam" + "\n" ); 
		
		System.out.println(" === Informasi data diri Karyawan PT. Bismillah Berkah === " + "\n" +
				"Nama		: " + mg4.getNama() + "\n" +
				"Jabatan		: Manager " + "\n" +
				"Usia		: " + mg4.getUsia() + "\n" + 
				"Gaji		: " + mg4.getGajiManager() + " Juta " + "\n" +
				"Jam Kerja	: " + mg4.getjamKerja() + " Jam" + "\n" ); 
		
		System.out.println(" === Informasi data diri Karyawan PT. Bismillah Berkah === " + "\n" +
				"Nama		: " + mg5.getNama() + "\n" +
				"Jabatan		: Staff " + "\n" +
				"Usia		: " + mg5.getUsia() + "\n" + 
				"Gaji		: " + mg5.getGaji() + " Juta " + "\n" +
				"Jam Kerja	: " + mg5.getjamKerja()  + " Jam" + "\n" ); 
		
	
	}
}
