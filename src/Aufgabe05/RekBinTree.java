package Aufgabe05;

public class RekBinTree {
	String s;
	Node root;

	RekBinTree(){
		
		int mitte = s.length()/2;
		s = bubbleS(s);	
		
		root.inh = s.charAt(mitte);
		root.nl = new Node(s.substring(0, mitte) );
		root.nr = new Node(s.substring(mitte+1, s.length() ) );
	}
	
	static String bubbleS(String uns){
		
		for(int x = 0; x < uns.length(); x++) {
			
			int i = 0;
			
			for(int j = i+1; j < uns.length(); j++) {
				
				if(uns.charAt(i) > uns.charAt(j) ) {
					
					uns = charSwap(uns, i, j);	
				}
			
				else { i++;	}
			
			}			
			
		}
		
		return uns;
	}
	
	static String charSwap(String s, int i, int j) {
		
		char uns [] = new char[s.length() ];
		for(int x = 0; x < s.length(); x++) {
			uns[x] = s.charAt(x);
		}
		uns[j] = s.charAt(i);
		uns[i] = s.charAt(j);
	
		String erg = "";
		for(int y = 0; y <s.length(); y++) {
			erg = erg + uns[y];
		}
		return erg;
	}
	
	int containsP(Character c, Node pointer) {
		if(pointer.inh == c) { root.anz++; }
		
		if(pointer.nl != null) { containsP(c, pointer.nl); }
		
		if(pointer.nr != null) { containsP(c, pointer.nr); }
		
		return root.anz;
		
	}

	int contains00(Character c) {
		root.contains(c, root);
		return root.anz;
	}
	
	public String toStringInO() {
		if(root.nl != null) { root.printInO(); }
		return root.pr;
	}
	
	public String toStringPre() {
		if(root != null) { root.printPreO(); }
		return root.pr;
	}
	
	public String toStringPost() {
		if(root.nl != null) { root.printPostO(); }
		return root.pr;
		
	}
	
	public String toStringRev() {
		if(root.nl != null) { root.printRevO(); }
		return root.pr;
	}
	
	
	
	
	

}
