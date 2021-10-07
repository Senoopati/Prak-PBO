package Modul7;

public class Manager extends Karyawan{
	private float jamKerja = 7.5f;
	
	public float getjamKerja() {
		return jamKerja;
	}
	
	public void setjamKerja(float jamTambahan) {
		this.jamKerja += jamTambahan;
	}
	
	public float getGajiManager() {
		return getGaji() * 2;
	}
}
