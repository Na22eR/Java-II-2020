package Aufgabe18;

abstract class SequenzE extends SequenzVater{

	int xPos;
	int yPos;
	
	SequenzE(String t, int x, int y){
		super(t);
		xPos = x;
		yPos = y;
	}
	
	abstract void add2Window();
	abstract int getXZugang();
	abstract int getYZugang();
	
}
