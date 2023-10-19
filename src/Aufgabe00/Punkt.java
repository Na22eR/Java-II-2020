package Aufgabe00;

import static jsTools.Graph.*;

public class Punkt {
	int xpos;
	int ypos;
	int d;
	int genesung;
	String clr;
	static int genesungsZeit = 70;
	
	Punkt(String cl){
		
		double xrmd = Math.random() *980;
		double yrmd = Math.random() *980;
		
		int x = (int) xrmd;
		int y = (int) yrmd;
		
		xpos = x;
		ypos = y;
		clr = cl;
		d = 13;
		genesung = 0;

		
	}

	void move() {
		
		double richt = Math.random();
		
		int sprg = 1;
		
		if(richt <= 0.125) {
			xpos += sprg;
			ypos += sprg;
		}
		
		if(richt <= 0.25 && richt > 0.125) {
			xpos += 00;
			ypos += sprg;
		}
		
		if(richt <= 0.375 && richt > 0.25) {
			xpos -= sprg;
			ypos += sprg;
		}
		
		if(richt <= 0.5 && richt > 0.375) {
			xpos -= sprg;
			ypos += 00;
		}
		
		if(richt <= 0.625 && richt > 0.5) {
			xpos -= sprg;
			ypos -= sprg;
		}
		
		if(richt <= 0.75 && richt > 0.625) {
			xpos -= 00;
			ypos -= sprg;
		}
		
		if(richt <= 0.875 && richt > 0.75) {
			xpos += sprg;
			ypos -= sprg;
		}
		
		if(richt <= 1 && richt > 0.875) {
			xpos += sprg;
			ypos -= 00;
		}
		
	}
	
	static void create() {
		
		
		Punkt ar [] = new Punkt [150];
		ar[0] = new Punkt("red");
		ar[1] = new Punkt("red");
		ar[2] = new Punkt("red");
		ar[3] = new Punkt("red");
		
		for(int i = 4; i < ar.length; i++) {
			ar[i] = new Punkt("cyan");
		}
		
		for(int i = 0; i < ar.length+1; i++) {
			
			for(int j = 0; j < ar.length; j++) {
				
				addCircle(ar[j].xpos, ar[j].ypos, ar[j].d, ar[j].clr);
				
				ar[j].move();
				
				if(ar[j].clr == "red") {
				
					ar[j].genesung++;
					if(ar[j].genesung > genesungsZeit) {  ar[j].clr ="green";  }	
				}
					
				for(int prf = 0; prf < ar.length; prf++) {
				if(ar[prf].clr == "red") {ar[prf].isCollision(ar); }	
				}
				
			}

			
			sleep(200);
			clearWindow();
		}
		
	
	}
	
	
	void isCollision(Punkt arr [] ) {
		
		for(int i = 0; i < arr.length; i++) {
			if( (arr[i].xpos <= xpos+d+5 && arr[i].xpos >= xpos) && (arr[i].ypos <= ypos+d+2 && arr[i].ypos >= ypos) && arr[i].genesung < genesungsZeit) {
				arr[i].clr = "red";
			}
			
		}
		
		
		
		
		
	}
}
