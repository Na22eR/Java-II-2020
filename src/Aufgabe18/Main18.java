package Aufgabe18;

public class Main18 {

	public static void main (String args [] ) {
	
		SequenzFluss s1 = new SequenzFluss("bla2");
		Start s = new Start("scuur", 50, 50, 100, s1);
		s.setNext(s1);
		Gateway g = new Gateway("bla4", 300, 100, 50, 2);
		s1.setNext(g);
		SequenzFluss s2 = new SequenzFluss("bla2");
		SequenzFluss s3 = new SequenzFluss("bla420");
		g.setNext(s2);
		g.setNext(s3);
		Aufgabe a1 = new Aufgabe("bla", 550, 75, 50, 50);
		Aufgabe a2 = new Aufgabe("bla", 550, 200, 50, 50);
		s2.setNext(a1);
		s3.setNext(a2);
		SequenzFluss s4 = new SequenzFluss("bla2");
		SequenzFluss s5 = new SequenzFluss("bla2");
		a1.setNext(s4);
		a2.setNext(s5);
		Ende e1 = new Ende("bla3", 750, 50, 100);
		Ende e2 = new Ende("bla3", 750, 175, 100);
		s4.setNext(e1);
		s5.setNext(e2);
		
		s.add2Window();
	
		//System.out.print(g.next[1].txt);
	
	}
}
