package Modul2;

public class Car {
	int Cadence;
	int Speed;
	int Gear;
	
	void changeCadence(int Ca) {
		Cadence = Ca;
	}
	
	void speedUp(int spd) {
		Speed = spd;
	}
	
	void changeGear(int Gr) {
		Gear = Gr;
	}
	
	void printInfo() {
		System.out.println(
				 " Cadence : " + Cadence + "\n" +
				 " Speed : " + Speed + "\n" +
				 " Gear Position : " + Gear + "\n" 
				 );
		 		
		
	}
}
