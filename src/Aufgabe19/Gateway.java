package Aufgabe19;

import static jsTools.Graph.*;
import static jsTools.Input.*;

public class Gateway extends SequenzVater implements SequenzI{

	int size;
	int xPos;
	int yPos;
	SequenzFluss next [];
	
	Gateway(String t, int x, int y, int sz, int arSZ, String col) {
		super(t, col);			
		xPos = x;
		yPos = y;
		size = sz;
		next = new SequenzFluss [arSZ];
	}
	
	Gateway(String t, int x, int y, int sz, int arSZ) {
		super(t);			
		xPos = x;
		yPos = y;
		size = sz;
		next = new SequenzFluss [arSZ];
	}
	
	

	
	void setNext(SequenzFluss n) {
		for(int i = 0; i < next.length; i++) {
			if (next[i] == null) { next [i] = n; break;}
		}
	}
	
	
	public void add2Window() {
		addRectBorder(xPos, yPos, size, size, 45.0, col, "black");
		addText("x", xPos+ (int)Math.sqrt( size * size + size * size)/4+8, yPos+10, 40, "black");
		for(int i = 0; i < next.length; i++) {
		next[i].add2Window(xPos+ (int)Math.sqrt( size * size + size * size) , yPos);
		}
	}
	
	
	public int getXZugang() {
		return xPos;
	}
	
	
	public int getYZugang() {
		return yPos;
	}
	
	
	public void simulate(Start s) {
		col = "yellow";
		s.add2Window();
		System.out.println("GateWay-String: " + txt);
		col ="gray";
		int x = readInt("Oberer-Pfad = 1, Unterer-Pfad = 2: ");
		
		switch (x) {
			case 1: System.out.println();		clearWindow(); 		next[0].next.simulate(s);		break;
			case 2: System.out.println();		clearWindow(); 		next[1].next.simulate(s);		break;
			default: System.out.println("Abbruch erfolgt!"); 			break;
		}
		
	}
}
