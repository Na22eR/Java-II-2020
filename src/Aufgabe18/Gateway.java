package Aufgabe18;

import static jsTools.Graph.*;

public class Gateway extends SequenzE{

	int size;
	SequenzFluss next [];
	Gateway(String t, int x, int y, int sz, int arSZ) {
		super(t, x, y);			
		size = sz;
		next = new SequenzFluss [arSZ];
	}

	
	void setNext(SequenzFluss n) {
		for(int i = 0; i < next.length; i++) {
			if (next[i] == null) { next [i] = n; break;}
		}
	}
	
	
	void add2Window() {
		addRectBorder(xPos, yPos, size, size, 45.0, "white", "black");
		addText("x", xPos+ (int)Math.sqrt( size * size + size * size)/4+8, yPos+10, 40, "black");
		for(int i = 0; i < next.length; i++) {
		next[i].add2Window(xPos+ (int)Math.sqrt( size * size + size * size) , yPos);
		}
	}
	
	
	int getXZugang() {
		return xPos;
	}
	
	
	int getYZugang() {
		return yPos;
	}



}
