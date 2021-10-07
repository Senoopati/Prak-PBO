package Modul3;

public class Nilai {
	int nilaiUTS;
	int nilaiUAS;
	int nilaiTugas;
	double nilaiTotal;
	
	void nilaiUts(int nilaiUTS) {
		this.nilaiUTS = nilaiUTS;
		System.out.println("Nilai UTS		: " + nilaiUTS);  
	}
	
	void nilaiUAS(int nilaiUAS) {
		this.nilaiUAS = nilaiUAS;
		System.out.println("Nilai UAS		: " + nilaiUAS); 
	}
	
	void nilaiTugas(int nilaiTugas) {
		this.nilaiTugas = nilaiTugas;
		System.out.println("Nilai Tugas		: " + nilaiTugas); 
	}
	
	Double totalNilai() {
		 return this.nilaiTotal = Double.valueOf(nilaiUTS + nilaiUAS + nilaiTugas)/3;
	 }
}
