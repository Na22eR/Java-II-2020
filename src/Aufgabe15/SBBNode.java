package Aufgabe15;

public class SBBNode {

	int keyy;
	SBBNode left;
	SBBNode right;
	Vermietung elem;
	
	SBBNode(){}
	
	SBBNode(int k, Vermietung f){
		keyy = k;
		elem = f;
		
	}
	
	void insert(Vermietung f) {
		
		SBBNode vergl = new SBBNode(f.fnr, f);
		
		if(keyy > vergl.keyy) { 
			if(left != null) { left.insert(f); }
			else { left = vergl; }	
		}
		
		else {
			if(right != null) { right.insert(f); }
			else { right = vergl; }
		}

	}
	
	
	Vermietung getFahrzeug(int key) {
		if(keyy == key) {
			return elem;
		}
		else {	
			if(keyy > key && left != null) { return left.getFahrzeug(key); }
			else if(keyy < key && right != null) { return right.getFahrzeug(key); }
			else { return null; }
		}
	}

	
	void printTree() {
		
		if(left != null) { left.printTree(); }
		
		elem.printf();
		
		if(right != null) { right.printTree(); }	

	}
	
	
}
