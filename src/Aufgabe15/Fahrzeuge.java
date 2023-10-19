package Aufgabe15;

public class Fahrzeuge extends Vermietung{
	
	int kfzKZ;
	int kmSt;
	
	Fahrzeuge(int x){ super(x); }
	
	Fahrzeuge(int fn, int kfz, int km){
		super(fn);
		kfzKZ = kfz;
		kmSt = km;
	}
}
