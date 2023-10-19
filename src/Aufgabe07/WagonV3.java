package Aufgabe07;

import static jsTools.Graph.*;

public class WagonV3 {
	int wagenNr = 0;
	int lng;
	int br;
	int xpos;
	int ypos;
	String col;
	WagonV3 next;
	
	//Volume-3
	double gewicht;
	
	
	WagonV3(int b){
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
	
	WagonV3(){}
	
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

class GueterWagon extends WagonV3{
	
	int zuladung;
	//Enthält Speise-W & Offener-Güter-W
}

class TankWagon extends GueterWagon {
	
	//Color = Braun
	int tankvolumen;
	
	void paint(int x, int y) {
		addRect(x, y, lng, br, col);
		addCircle(x, y + br, 20, "darkGray");
		addCircle(x+lng-20, y + br, 20, "darkGray");
		addRect(x+10,y+br-10,10,10, "brown");
		if( next != null) {
			addRect(x+lng, y + br - 20, 10, 10, "darkGray" );
			next.paint(x+lng+10, ypos);
		}
		
	}
}

class AutoTransporter extends GueterWagon{
	
	//Color = Schwarz
	int autoplatz;
	
	void paint(int x, int y) {
		addRect(x, y, lng, br, col);
		addCircle(x, y + br, 20, "darkGray");
		addCircle(x+lng-20, y + br, 20, "darkGray");
		addRect(x+10,y+br-10,10,10, "black");
		if( next != null) {
			addRect(x+lng, y + br - 20, 10, 10, "darkGray" );
			next.paint(x+lng+10, ypos);
		}
		
	}
}

class Personenwagen extends WagonV3 {
	
	//Color = Weiß
	int sitzpl;
	int stehpl;
	
	void paint(int x, int y) {
		addRect(x, y, lng, br, col);
		addCircle(x, y + br, 20, "darkGray");
		addCircle(x+lng-20, y + br, 20, "darkGray");
		addRect(x+10,y+br-10,10,10, "white");
		if( next != null) {
			addRect(x+lng, y + br - 20, 10, 10, "darkGray" );
			next.paint(x+lng+10, ypos);
		}
		
	}
}
