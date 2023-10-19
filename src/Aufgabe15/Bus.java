package Aufgabe15;

public class Bus extends Fahrzeuge{
	
	int anzSitz;
	
	Bus(int anz, int fn, int kfz, int km){
		super(fn, kfz, km);
		anzSitz = anz;
		
	}
	
	void printf() {
		System.out.println(fnr + " " + kfzKZ + " " + kmSt + " " + anzSitz);
	}
}
