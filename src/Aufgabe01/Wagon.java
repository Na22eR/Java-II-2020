package Aufgabe01;

import static jsTools.Graph.*;

public class Wagon {
	int lng;
	int br;
	int xpos;
	int ypos;
	Wagon next;
	
	Wagon(int lg, int b){
		lng = lg;
		br = b;
		ypos = 740 - b -30;
		
	}
	
	void paint(int x, int y) {
		addRect(x, y, lng, br, "black");
		addCircle(x, y + br, 30, "gray");
		addCircle(x+lng-30, y + br, 30, "gray");
		
		if( next != null) {
			addRect(x+lng, y + br - 20, 10, 10, "gray" );
			next.paint(xpos+lng+10, ypos);
		}
		
	}
}
