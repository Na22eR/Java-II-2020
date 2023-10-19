package Aufgabe19;

import static jsTools.Graph.*;

public class Ende extends SequenzVater implements SequenzI{
	
	int size;
	int xPos;
	int yPos;
	
	Ende(String t, int x, int y, int sz, String col){
		super(t, col);
		xPos = x;
		yPos = y;
		size = sz;
		
	}
	
	Ende(String t, int x, int y, int sz){
		super(t);
		xPos = x;
		yPos = y;
		size = sz;
		
	}
	
	
	public void add2Window() {
	/*	addCircleBorder(xPos, yPos, size, "white");
		addCircleBorder(xPos-1, yPos-1, size+2, "white");
		addCircleBorder(xPos+1, yPos+1, size-2, "white"); 		*/
		
		addCircle(xPos, yPos, size, "black");
		addCircle(xPos+10, yPos+10, size-20, col);	
		
		addText("Fertig!", xPos+size/4, yPos+size/2+9, 18, "black");
	}
	
	
	public int getXZugang() {
		return xPos;
	}
	
	
	public int getYZugang() {
		return yPos + (size / 2);
	}
	
	public void simulate(Start s) {
		col = "yellow";
		s.add2Window();
		System.out.println(txt);
		col ="gray";
		sleep(100);
		clearWindow();
		s.add2Window();
		System.out.println("Fertig!");
	}
}
