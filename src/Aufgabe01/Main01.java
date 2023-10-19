package Aufgabe01;

public class Main01 {

	public static void main(String args [] ) {
		Lok jim = new Lok(200, 60);
		Wagon x = new Wagon(200, 60);
		jim.appWagon(x);
		Wagon y = new Wagon(200, 60);
		jim.appWagon(y);
		jim.paint();
		
		
		
		
	}
}
