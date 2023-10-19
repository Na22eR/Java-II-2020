package Aufgabe18;

import static jsTools.Graph.*;

public class Ende extends SequenzE{
	
	int size;
	
	Ende(String t, int x, int y, int sz){
		super(t, x, y);
		size = sz;
		
	}
	
	
	void add2Window() {
	/*	addCircleBorder(xPos, yPos, size, "white");
		addCircleBorder(xPos-1, yPos-1, size+2, "white");
		addCircleBorder(xPos+1, yPos+1, size-2, "white"); 		*/
		
		addCircle(xPos, yPos, size, "black");
		addCircle(xPos+10, yPos+10, size-20, "white");	
		
		addText("Fertig!", xPos+size/4, yPos+size/2+9, 18, "black");
	}
	
	
	int getXZugang() {
		return xPos;
	}
	
	
	int getYZugang() {
		return yPos + (size / 2);
	}
}
