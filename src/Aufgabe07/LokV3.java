package Aufgabe07;

import static jsTools.Graph.*;

public class LokV3 {
	int lng;
	int br;
	int posx;
	int posy;
	int zuglng = 0;
	WagonV3 wagen;
	
	LokV3(int lg, int b){
		lng = lg;
		br = b;
		posx = 0;
		posy = 740 - b -20;
				
				 
	}
	
	void appWagon(WagonV3 w) {
		
		if(wagen == null) {
			wagen = w;
			w.xpos = posx + lng + 10;
			zuglng++;
		}
		
		else {
			WagonV3 pointer = wagen;
			
			while(pointer.next != null) { pointer = pointer.next; }
			
			pointer.next = w;
			w.xpos = pointer.xpos + lng + 10;
			zuglng++;
		}
		
	}
	
	void paint() {
		
		addRect(posx, posy, lng, br, "black");
		addCircle(posx, posy + br, 20, "darkGray");
		addCircle(posx+lng-20, posy + br, 20, "darkGray");
		addRect(posx, posy-20, 40, 20, "black");
		addTriangle(posx+20, posy-20, 40, 17, 0, "black");
		addRect(posx+lng, posy + br - 20, 10, 10, "darkGray" );
		
		if(wagen != null) {
			wagen.paint(posx+lng+10, posy);	
		}
		
	}	
	
	WagonV3 returnFirst() {
		if(wagen != null) {
			WagonV3 x = wagen;
			wagen = wagen.next;
			return x;
		}
		else { return null; }
	}
	
	WagonV3 returnLast() {
		if(wagen == null) {
			return null;
		}
		else {
			WagonV3 pointer = wagen;
			
			while(pointer.next.next != null) { pointer = pointer.next; }
			
			WagonV3 x = pointer.next;
			
			pointer.next = null;
			
			return x;
			
		}
	}
	
	void insertFirst(WagonV3 x) {
		if(wagen == null) { wagen = x;}
		else {
			x.next = wagen;
			wagen = x;
		}	
	}
	
	void switchLok(LokV3 z1, LokV3 z2) {
	
		while(z1.wagen != null) {
			z2.insertFirst(z1.returnLast() );
		}
		
	}
	
	void swap(int a, int b) {
		a--; b--;
		WagonV3 wa = null;
		WagonV3 wb = null;
		
		
		if(a < b) {
			wa = getW(a);
			wb = getW(b-1);
		}
		
		if(b < a) {
			wb = getW(b);
			wa = getW(a-1);	
		}
		
		if(a < b) {
			insW(a, wb);
			insW(b, wa);
		}
		
		if(b < a) {
			insW(b, wa);
			insW(a, wb);
		}
	}
	
	WagonV3 getW(int i) {
		
		int counter = 0;
		
		WagonV3 pointer = wagen;
		WagonV3 safe;
		
		if(i == 0) {
			
			safe = wagen;
			wagen = wagen.next; 
			safe.next = null;
			
			return safe;
		}
		
		else {
			
			while(counter < i-1) {
				pointer = pointer.next;
				counter ++;
			}
			
			safe = pointer.next;
			pointer.next = pointer.next.next;
			safe.next = null;
			
			return safe;
		}
	}
	
	void insW(int i, WagonV3 insert) {
		if(i == 0) {
			insert.next = wagen;
			wagen = insert;
			
		}
		
		else{
		WagonV3 pointer = wagen;
		
		for(int x = 0; x < i-1; x++) {
			pointer = pointer.next;
		}
		
		if(pointer.next != null) { insert.next = pointer.next; }
		pointer.next = insert;
		}
	
	}
	
	void swapInhalt(int a, int b) {
		
		int asafe;
		int bsafe;
		WagonV3 pointerA = wagen;
		WagonV3 pointerB = wagen;
		
		for(int i = 0; i < a; i++) {
			pointerA = pointerA.next;	
		}
		asafe =  pointerA.wagenNr; 
		
		
		for(int i = 0; i < b; i++) {
			pointerB = pointerB.next; 
		}
		bsafe = pointerB.wagenNr;
	
		
		pointerA.wagenNr = bsafe;
		pointerB.wagenNr = asafe;
	}
	
	int shortest(int st) {
		
		st--;
		WagonV3 pointer = wagen;
		WagonV3 shrt = new WagonV3();
		
		if(st > zuglng) { return -1; }
		//if(st == 0) {	}
		else {
		
			for(int i = 0; i < st; i++) {
				pointer = pointer.next;
			} // der Poointer hat nun die Startposition
			shrt.lng = pointer.lng;
		
			for(int i = 0; i < zuglng -st; i++) {
				if(pointer.lng < shrt.lng) { shrt.lng = pointer.lng; shrt.wagenNr = pointer.wagenNr; }
				pointer = pointer.next;
			}
			return shrt.wagenNr;
		}
	}
	
	void sortZug() {
		
		for(int i = 0; shortest(i+1) > 0; i++) {
			swap(i, shortest(i+1) );
		}
		
	}
	
		
}
