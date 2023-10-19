package Aufgabe15;

public class Main15 {
	
public static void main (String args [] ) {
	SortBinTree treee = new SortBinTree();
	
	 PKW x = new PKW("black", 1, 0, 0);
	 PKW y = new PKW("green", 2, 0, 0);
	 PKW z = new PKW("white", 3, 0, 0);
	 PKW a = new PKW("blue", 4, 0, 0);

	// treee.root = new SBBNode(2, y);
	 treee.insert(y);
	 treee.insert(x);
	 treee.insert(z);
	 treee.insert(a);
	 
	 //System.out.println( treee.getFahrzeug(4).fnr );
	 //SBBNode vergl = new SBBNode(x.fnr, x);
	 //System.out.println(vergl.elem );
	 //System.out.println(treee.root.keyy);
	 treee.printTree();

}

}

