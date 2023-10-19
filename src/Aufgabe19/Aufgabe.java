package Aufgabe19;

import static jsTools.Graph.*;
import static jsTools.Input.readLine;

public class Aufgabe extends SequenzVater implements SequenzI{

	int xPos;
	int yPos;
	int xSize;
	int ySize;
	SequenzFluss next;
	
	Aufgabe(String t, int x, int y, SequenzFluss n, int szX, int szY, String col) {
		super(t, col);
		xPos = x;
		yPos = y;
		xSize = szX;
		ySize = szY;
		next = n;
	}
	
	Aufgabe(String t, int x, int y, int szX, int szY, String col) {
		super(t, col);	
		xPos = x;
		yPos = y;
		xSize = szX;
		ySize = szY;
	}
	
	Aufgabe(String t, int x, int y, int szX, int szY) {
		super(t);	
		xPos = x;
		yPos = y;
		xSize = szX;
		ySize = szY;
	}
	
	
	void setNext(SequenzFluss n) {
		next = n;
	}
	
	
	
	public void add2Window() {
		addRectBorder(xPos, yPos, xSize, ySize, col);
		addText(txt, xPos+xSize/4, yPos+ySize/2+9, 18, "black");
		
		next.add2Window(xPos + xSize, yPos + (ySize / 2));
	}
	
	
	public int getXZugang() {
		return xPos;
	}
	
	
	public int getYZugang() {
		return yPos + (ySize / 2);
	}
	
	
	public void simulate(Start s) {
		col = "yellow";
		s.add2Window();
		System.out.println("String-Aufgabe: " + txt);
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


