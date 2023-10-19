package Aufgabe18;

abstract class SequenzNS extends SequenzN{
	
	SequenzFluss next;
	
	SequenzNS(String t, int x, int y, SequenzFluss n) {
		super(t, x, y);			
		next = n;
	}
	
	abstract void add2Window();
	abstract int getXZugang();
	abstract int getYZugang();
	
}
