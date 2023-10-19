package Aufgabe05;

public class Node {
	Character inh;
	Node nl;
	Node nr;
	String pr;
	int anz;
	
	Node(String s){
		
		int mitte = s.length()/2;
		inh = s.charAt(mitte);
		
		if(s != "") {
		nl = new Node(s.substring(0, mitte) );
		nr = new Node(s.substring(mitte+1, s.length() ) );
		
		}
		
		nl = null;
		nr = null;
	}
	
	String printInO() {
		
		if(nl!= null) { nl.printInO(); }
		
		pr += inh;
		
		if(nr != null) { nr.printInO(); }
		
		return pr;
	}
	
	String printPreO() {
		
		pr += inh;
		
		if(nl!= null) { nl.printPreO(); }	
		
		if(nr != null) { nr.printPreO(); }
		
		return pr;
	}
	
	String printPostO() {

		if(nl!= null) { nl.printPostO(); }	
		
		if(nr != null) { nr.printPostO(); }
		
		pr += inh;
		
		return pr;
	}
	
	String printRevO() {
	
		if(nr != null) { nr.printRevO(); }
		
		pr += inh;
		
		if(nl!= null) { nl.printRevO(); }	
		
		return pr;
	}
	
	int contains(Character c, Node pointer) {
		
		if(pointer.inh == c) { anz++; }
		if(pointer.nl != null) { contains(c, pointer.nl); }
		if(pointer.nr != null) { contains(c, pointer.nr); }
		return anz;
	}
	
	
}
