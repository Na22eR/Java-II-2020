package Aufgabe20;

import static jsTools.Input.*;


public class Rechner {

	String aufgabe;
	
	Rechner(){
		aufgabe = readLine("Aufgabe eingeben: ");
	}
	
	
	void berechnen() {
		
		try {
		
			String [] teile = aufgabe.split((" ") );	
			
		if(teile[1].equals("/") && teile[2].equals("0") ) {
			throw new Exception("Fehler, Null-Division! ");
		}
		
		for(int i = 0; i < teile[0].length(); i++)  {
			if(teile[0].charAt(i) < 48 || teile[0].charAt(i) > 57) {
				throw new Exception("Fehler, falsches Zahlenformat! ");
			}
		}
		
		for(int i = 0; i < teile[2].length(); i++)  {
			if(teile[2].charAt(i) < 48 || teile[2].charAt(i) > 57) {
				throw new Exception("Fehler, falsches Zahlenformat! ");
			}
		}
		
		boolean add = (teile[1].equals("+")  == false);
		boolean sub = (teile[1].equals("-")  == false);
		boolean mul = (teile[1].equals("*")  == false);
		boolean div = (teile[1].equals("/")  == false);

		if(add && sub && mul && div == true) {
			throw new Exception("Fehler, RechenOperator falsch! ");
		}
		
		if(teile[3].equals("=")  == false) {
			throw new Exception("Fehler, GleichheitsZeichen vergessen! ");
		}	
		
			if (teile[1].equals("+") ) {
				System.out.println( teile[0] + " " + "+" + " "  + teile[2] + " " + "=" + " "  + addition( teile[0], teile[2]) );
			}
			else if(teile[1].equals("-") ){
				System.out.println( teile[0] + " " + "-" + " "  + teile[2] + " " + "=" + " "  + substraktion( teile[0], teile[2]) );
			}
			else if(teile[1].equals("*") ){
				System.out.println( teile[0] + " " + "*" + " "  + teile[2] + " " + "=" + " "  + multiplikation( teile[0], teile[2]) );
			}
			else if(teile[1].equals("/") ){
				System.out.println( teile[0] + " " + "/" + " "  + teile[2] + " " + "=" + " "  + division( teile[0], teile[2]) );
			}
	
		}
		
		catch(Exception e) {
		//	System.out.println(e.getMessage() );
		}
		
	}
	
	
	int addition(String s1, String s2) {
		int i = Integer.valueOf(s1);
		int j = Integer.valueOf(s2);
		return i+j;
	}
	
	
	int substraktion(String s1, String s2) {
		int i = Integer.valueOf(s1);
		int j = Integer.valueOf(s2);
		return i-j;
	}
	
	
	int multiplikation(String s1, String s2) {
		int i = Integer.valueOf(s1);
		int j = Integer.valueOf(s2);
		return i*j;
	}
	
	
	int division(String s1, String s2) {
		int i = Integer.valueOf(s1);
		int j = Integer.valueOf(s2);
		return i/j;
	}
}
