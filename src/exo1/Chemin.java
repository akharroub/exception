package exo1;

public class Chemin{ 
	public static void main (String args[]){
		int n ;
		System.out.println ("donnez un entier : ") ;
		n = 0;
		try {
			System.out.println ("debut premier bloc try") ;
			if (n!=0) throw new Except (n) ;
			System.out.println ("fin premier bloc try") ;
		}catch (Except e) {
			System.out.println ("catch 1 - n = " + e.n) ;
		}
		System.out.println ("suite du programme") ;
		try{ 
			System.out.println ("debut second bloc try") ;
			if (n!=1) throw new Except (n) ;
			System.out.println ("fin second bloc try") ;
		}catch (Except e){ 
			System.out.println ("catch 2 - n = " + e.n) ;
			System.exit(-1) ;
		}
		System.out.println ("fin programme") ;
	}
}
