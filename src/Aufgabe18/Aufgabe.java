package Aufgabe18;

import static jsTools.Graph.*;

public class Aufgabe extends SequenzE {

	int xSize;
	int ySize;
	SequenzFluss next;
	
	Aufgabe(String t, int x, int y, SequenzFluss n, int szX, int szY) {
		super(t, x, y);			
		xSize = szX;
		ySize = szY;
		next = n;
	}
	
	Aufgabe(String t, int x, int y, int szX, int szY) {
		super(t, x, y);			
		xSize = szX;
		ySize = szY;
	}
	
	
	void setNext(SequenzFluss n) {
		next = n;
	}
	
	
	
	void add2Window() {
		addRectBorder(xPos, yPos, xSize, ySize, "white");
		addText(txt, xPos+xSize/4, yPos+ySize/2+9, 18, "black");
		
		next.add2Window(xPos + xSize, yPos + (ySize / 2));
	}
	
	
	int getXZugang() {
		return xPos;
	}
	
	
	int getYZugang() {
		return yPos + (ySize / 2);
	}	
}


