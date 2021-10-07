package Modul8;

public class DemoBank {

	public static void main(String[] args) {
		Bank b = new Bank();
		BankPribadi bp = new BankPribadi();//Overriding
		Bank bu = new BankUmum(); //Upcasting
		BankPasar bpsr = new BankPasar();//Overriding
		BankSyariah bs = new BankSyariah();//Overriding
		
		System.out.println("Bank : " + b.rasioBunga(2));
		System.out.println("Bank Pribadi : " + bp.rasioBunga(1));
		System.out.println("Bank Umum : " + bu.rasioBunga(3));
		System.out.println("Bank Pasar : " + bpsr.rasioBunga(4));
		System.out.println("Bank Syariah : " + bs.rasioBunga(1));
	}

}
