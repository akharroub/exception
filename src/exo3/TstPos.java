package exo3;
public class TstPos {
	
	public static void main (String args[]){ 
		
		System.out.println ("debut main");
		
		boolean ok = false ;
		
		while (!ok){ 
			try{
				System.out.print ("donnez un entier positif : ") ;
				int n = Clavier.lireInt() ;
				Positif ep = new Positif (n) ;
				ok = true ;
			}catch (ErrConst e){
				System.out.println ("*** erreur construction ***") ;
			}
		}
		System.out.println ("fin main") ;
	}
}

