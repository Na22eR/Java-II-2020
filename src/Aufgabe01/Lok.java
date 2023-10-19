package Aufgabe01;

import static jsTools.Graph.*;

public class Lok {
	int lng;
	int br;
	int posx;
	int posy;
	Wagon wagen;
	
	Lok(int lg, int b){
		lng = lg;
		br = b;
		posx = 0;
		posy = 740 - b -30;
				
				 
	}
	
	void appWagon(Wagon w) {
		
		if(wagen == null) {
			wagen = w;
			w.xpos = posx + lng + 10;
		}
		
		else {
			Wagon pointer = wagen;
			
			while(pointer.next != null) { pointer = pointer.next; }
			
			pointer.next = w;
			w.xpos = pointer.xpos + lng + 10;
		}
		
	}
	
	void paint() {
		
		addRect(posx, posy, lng, br, "red");
		addCircle(posx, posy + br, 30, "gray");
		addCircle(posx+lng-30, posy + br, 30, "gray");
		addRect(posx, posy-40, 80, 40, "red");
		addTriangle(posx+40, posy-40, 80, 35, 0, "red");
		addRect(posx+lng, posy + br - 20, 10, 10, "gray" );
		
		if(wagen != null) {
			wagen.paint(posx+lng+10, posy);	
		}
		
	}	
	
	Wagon returnFirst() {
		if(wagen != null) {
			Wagon x = wagen;
			wagen = wagen.next;
			return x;
		}
		else { return null; }
	}
	
	Wagon returnLast() {
		if(wagen == null) {
			return null;
		}
		else {
			Wagon pointer = wagen;
			
			while(pointer.next.next != null) { pointer = pointer.next; }
			
			Wagon x = pointer.next;
			
			pointer.next = null;
			
			return x;
			
		}
	}
	
	void insertFirst(Wagon x) {
		if(wagen == null) { wagen = x;}
		else {
			x.next = wagen;
			wagen = x;
		}	
	}
	
	void switchLok(Lok z1, Lok z2) {
	
		while(z1.wagen != null) {
			z2.insertFirst(z1.returnLast() );
		}
		
	}
}
