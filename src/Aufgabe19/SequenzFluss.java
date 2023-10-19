package Aufgabe19;

import static jsTools.Graph.*;

public class SequenzFluss extends SequenzVater {
	SequenzI next;
	
	SequenzFluss(String t, SequenzI n, String col){
		super(t, col);
		next = n;
	}
	
	SequenzFluss(String t, String col){
		super(t, col);
	}
	
	SequenzFluss(String t){
		super(t);
	}
	
	
	void setNext(SequenzI n) {
		next = n;
	}
	
	
	void add2Window(int x, int y) {
		addArrow(x, y, next.getXZugang(), next.getYZugang(), "black" );
		next.add2Window();
	}
}
