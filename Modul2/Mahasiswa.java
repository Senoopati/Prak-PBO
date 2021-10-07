package Modul2;

public class Mahasiswa {
	String nama;
	String nim;
	String alamat;
	int semester;
  
    void tampilkanNama(String namaa) {
    	nama = namaa;
    	System.out.println("Nama 	: " + nama );
    }
    
    void tampilkanNIM(String NIM) {
    	nim = NIM;
    	System.out.println("NIM 	: " + nim );
    }
    
    void tampilkanAlamat(String almt) {
    	alamat = almt;
    	System.out.println("Alamat 	: " + alamat);
    }
    
    void tampilkanSemester(int smstr) {
    	semester = smstr;
    	System.out.println("Semester: " + semester);
    }
}
