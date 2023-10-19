package Aufgabe13;

import static jsTools.Graph.*;

public class Main13 {

	public static void main(String args [] ) {
		
		addArrow(30,355, 710,355,"black");
		addArrow(355,710, 355,30,"black");
		//paintFunctionX(30,710);
		//paintFunctionXY(30,710, 710, 50);
		paintFunction(30,710,710,50,new Potenz2() );
		
	}
	
	static void paintFunctionX(int xmin, int xmax) {
	
		Potenz2 func = new Potenz2();
		
		int feinheit = 1;
		
		for(int i = 0; i < xmax; i += feinheit) {
			addLine(i+355, func.f(i)+355, 				i+feinheit+355, func.f(i+feinheit)+355, "black" );
			addLine(-i+355, func.f(-i)+355, 			-i+feinheit+355, func.f(-i+feinheit)+355, "black" );
		
		}
	}
	
	
	static void paintFunctionXY(int xmin, int xmax, int ymin, int ymax) {
			
		Potenz2 func = new Potenz2();
		
		int feinheit = 1;
			
		for(int i = 0; i < xmax; i += feinheit) {
			
			addLine(i+355, func.f(i)+355, 				i+feinheit+355, func.f(i+feinheit)+355, "black" ); 				//rechts
			addLine(-i+355, func.f(-i)+355, 			-i+feinheit+355, func.f(-i+feinheit)+355, "black" );			//links
		
			if(func.f(i)+355 < ymax && func.f(-i)+355 <= ymax ) {
				return;
			}
		}
		
	}
	
	
	static void paintFunction(int xmin, int xmax, int ymin, int ymax, Function x) {
																			
		int feinheit = 1;
			
		for(int i = 0; i < xmax; i += feinheit) {
			
			addLine(i+355, x.f(i)+355, 				i+feinheit+355, x.f(i+feinheit)+355, "black" ); 				//rechts
			addLine(-i+355, x.f(-i)+355, 			-i+feinheit+355, x.f(-i+feinheit)+355, "black" );			//links
		
			if(x.f(i)+355 < ymax && x.f(-i)+355 <= ymax ) {
				return;
			}
		}
		
	}
}
