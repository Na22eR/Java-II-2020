package Aufgabe06;

import static jsTools.Graph.*;

public class WagonV2 {
	int wagenNr = 0;
	int lng;
	int br;
	int xpos;
	int ypos;
	String col;
	WagonV2 next;
	
	
	WagonV2(int b){
		lng = (int) (Math.random()*100.9+20 );
		br = b;
		ypos = 740 - b -20;
		wagenNr++;
		
		int col = (int) (Math.random()*7.9);
		switch(col) {
		case 1: this.col = "blue";
		break;
		case 2: this.col = "cyan";
		break;
		case 3: this.col = "green";
		break;
		case 4: this.col = "magenta";
		break;
		case 5: this.col = "orange";
		break;
		case 6: this.col = "red";
		break;
		case 7: this.col = "yellow";
		break;
		default: this.col = "gray";
		}
		
		
	}
	
	WagonV2(){}
	
	void paint(int x, int y) {
		addRect(x, y, lng, br, col);
		addCircle(x, y + br, 20, "darkGray");
		addCircle(x+lng-20, y + br, 20, "darkGray");
		
		if( next != null) {
			addRect(x+lng, y + br - 20, 10, 10, "darkGray" );
			next.paint(x+lng+10, ypos);
		}
		
	}
	
}
