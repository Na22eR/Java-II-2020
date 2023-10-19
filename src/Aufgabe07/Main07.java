package Aufgabe07;

import static jsTools.Graph.*;

public class Main07 {
	public static void main(String args [] ) {
		LokV3 jim = new LokV3(100, 60);
		WagonV3 x = new WagonV3(60);
		jim.appWagon(x);
		WagonV3 y = new WagonV3(60);
		jim.appWagon(y);
		WagonV3 z = new WagonV3(60);
		jim.appWagon(z);
		WagonV3 a = new WagonV3(60);
		jim.appWagon(a);
		jim.paint();
		jim.sortZug();
		//jim.swap(2,1);
		initWindow();
		jim.paint();
		addCircle(10,10,20,"black");
		
		
	}
}
