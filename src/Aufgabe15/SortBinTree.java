package Aufgabe15;

public class SortBinTree {

	SBBNode root;
				
	SortBinTree(){
		root = null;
	}
	
	void insert(Vermietung f) {    
		
		SBBNode vergl = new SBBNode(f.fnr, f);
		
		if(root == null) {
			root = vergl;
		}
		else{
			root.insert(f);  
		}
	}
	
	
	void printTree() {
		if(root == null) {
			System.out.println("Keine Fahrzeuge im Baum");
		}
		else { root.printTree(); }
	}
	
	
	Vermietung getFahrzeug(int key) {
		
		if(root == null) {
			return null;
		}
		else{
			return root.getFahrzeug(key);  
		}
	}

	
}




