package Aufgabe18;

import static jsTools.Graph.*;

public class SequenzFluss extends SequenzVater {
	SequenzE next;
	
	SequenzFluss(String t, SequenzE n){
		super(t);
		next = n;
	}
	
	SequenzFluss(String t){
		super(t);
	}
	
	
	void setNext(SequenzE n) {
		next = n;
	}
	
	
	void add2Window(int x, int y) {
		addArrow(x, y, next.getXZugang(), next.getYZugang(), "black" );
		next.add2Window();
	}
}
