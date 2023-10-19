package Aufgabe15;

public class PKW extends Fahrzeuge{
	
	String col;
	
	PKW(int x){
		super(x);
	}
	
	PKW(String cl, int fn, int kfz, int km){
		super(fn, kfz, km);
		col = cl;
		
	}
	
	void printf() {
		System.out.println(fnr + " " + kfzKZ + " " + kmSt + " " + col);
	}
	
}
