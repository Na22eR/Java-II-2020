package Aufgabe19;

import static jsTools.Graph.*;
import static jsTools.Input.*;

public class Start extends SequenzVater{
	
	int xPos;
	int yPos;
	int size;
	SequenzFluss next;

	Start(String t, int x, int y, int sz, SequenzFluss n, String col) {
		super(t, col);			
		xPos = x;
		yPos = y;
		size = sz;
		next = n;
	}
	
	
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
		addCircleBorder(xPos, yPos, size, col);
		addText(txt, xPos+size/4, yPos+size/2+9, 18, "black");
		next.add2Window(xPos + size, yPos + (size/2) );
	}
	
	
	void simulate(Start s) {
		col = "yellow";
		s.add2Window();
		System.out.println("Start-String: " + txt);
		col ="gray";
		if(readLine("Für Weiter yes, Bei Abbruch no: ").equals("yes") ) {
			System.out.println();
			clearWindow();
			next.next.simulate(s);
		}
		else {
			System.out.println("Abbruch erfolgt!");
		}
	}
	
}
