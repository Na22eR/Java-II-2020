package Aufgabe37;

import static jsTools.Graph.*;

public class Main37 {
	public static void main(String args [] ) {
		Eis e1 = new EisWaffel (new Heidelbeere( new Zitrone (new Erdbeere (new Pfefferminz ( new Waffel() ) ) ) ) );
		System.out.println(e1.getPreis() );
		e1.paint(100, 200);
	}	
}

abstract class Eis {
	abstract double getPreis();
	abstract void paint(int x, int y);
}


class Waffel extends Eis{
	double getPreis() {return 0.5;}
	void paint(int x, int y) {
		addTriangle(x+25, y, 60, 140, 180, "orange");
	}
	
	
}

class Becher extends Eis{
	double getPreis() {return 0.0;}
	void paint(int x, int y) {
		addRect(x-10, y, 70, 40, "lightGray");
	}
	
}



abstract class EisTops extends Eis{
	Eis tops;
}

class Schoko extends EisTops{
	Schoko(Eis x){
		tops = x;
	}
	
	double getPreis() {
		return 1.0 + tops.getPreis();
	}
	
	void paint(int x, int y) {
		addCircle(x, y, 50, "brown");
		tops.paint(x, y+35);
		
	}
}

class Heidelbeere extends EisTops{
	Heidelbeere(Eis x){
		tops = x;
	}
	
	double getPreis() {
		return 1.0 + tops.getPreis();
	}
	
	void paint(int x, int y) {
		addCircle(x, y, 50, "red");
		tops.paint(x, y+35);
		
	}
}

class Zitrone extends EisTops{
	Zitrone(Eis x){
		tops = x;
	}
	
	double getPreis() {
		return 1.0 +  tops.getPreis();
	}
	
	void paint(int x, int y) {
		addCircle(x, y, 50, "yellow");
		tops.paint(x, y+35);
		
	}
}

class Pfefferminz extends EisTops{
	Pfefferminz(Eis x){
		tops = x;
	}
	
	double getPreis() {
		return 1.0 + tops.getPreis();
	}
	
	void paint(int x, int y) {
		addCircle(x, y, 50, "green");
		tops.paint(x, y+35);
		
	}
}

class Erdbeere extends EisTops{
	Erdbeere(Eis x){
		tops = x;
	}
	
	double getPreis() {
		return 1.0 + tops.getPreis();
	}
	
	void paint(int x, int y) {
		addCircle(x, y, 50, "red");
		tops.paint(x, y+35);
		
	}
}

class PfirsichAprikose extends EisTops{
	PfirsichAprikose(Eis x){
		tops = x;
	}
	
	double getPreis() {
		return 1.0 + tops.getPreis();
	}
	
	void paint(int x, int y) {
		addCircle(x, y, 50, "orange");
		tops.paint(x, y+35);
		
	}
}

class EisWaffel extends EisTops{
	EisWaffel(Eis x){
		tops = x;
	}
	
	double getPreis() {
		return 0.5 + tops.getPreis();
	}
	
	void paint(int x, int y) {
		addCircle(x+5, y, 35, "orange");
		tops.paint(x, y+15);
	}
	
}