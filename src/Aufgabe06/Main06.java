package Aufgabe06;

import static jsTools.Graph.*;

public class Main06 {
	public static void main(String args [] ) {
		LokV2 jim = new LokV2(100, 60);
		WagonV2 x = new WagonV2(60);
		jim.appWagon(x);
		WagonV2 y = new WagonV2(60);
		jim.appWagon(y);
		WagonV2 z = new WagonV2(60);
		jim.appWagon(z);
		WagonV2 a = new WagonV2(60);
		jim.appWagon(a);
		jim.paint();
		jim.sortZug();
		//jim.swap(2,1);
		initWindow();
		jim.paint();
		addCircle(10,10,20,"black");
		
		
	}
}
