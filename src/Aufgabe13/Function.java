package Aufgabe13;

abstract class Function {
	abstract int f(int x);	
	}


	class Potenz2 extends Function{
		
		int f(int x) { 
			return (-x*x)/40;
		}

	}


	class Potenz3 extends Function{

		int f(int x) {
			return (-x*x*x);
		}
		
		
	}

	/*
	class Sinus extends Function{
		
		int f(int x) {
			double x2 = (double) x;
			return Math.sin(x2);
		}
		
	}
	*/

