package Aufgabe18;

import static jsTools.Graph.*;

public class Start extends SequenzVater{
	
	int xPos;
	int yPos;
	int size;
	SequenzFluss next;

	Start(String t, int x, int y, int sz, SequenzFluss n) {
		super(t);			
		xPos = x;
		yPos = y;
		size = sz;
		next = n;
	}
	
	
	Start(String t, int x, int y, int sz) {
		super(t);			
		xPos = x;
		yPos = y;
		size = sz;
		
	}

	
	void setNext(SequenzFluss n) {
		this.next = n;
	}
	
	
	void add2Window() {
		addCircleBorder(xPos, yPos, size, "white");
		addText(txt, xPos+size/4, yPos+size/2+9, 18, "black");
		next.add2Window(xPos + size, yPos + (size/2) );
	}
}
