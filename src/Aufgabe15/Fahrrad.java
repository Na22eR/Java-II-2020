package Aufgabe15;

public class Fahrrad extends Vermietung{
	
	int bj;
	String hatE;
	String col;
	
	Fahrrad(int b, String e, String cl, int fn){
		super(fn);
		bj = b;
		hatE = e;
		col = cl;
	}
	
	void printf() {
		System.out.println(fnr +  " " + bj + " " + hatE + " " + col);
	}
}
