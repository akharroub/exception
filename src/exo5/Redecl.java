package exo5;


public class Redecl{ 
	public static void main (String args[]){ 
		int n ;
		for (n=1 ; n<=3 ; n++){
			try{
				A a = new A(n) ;
			}catch (Erreur1 e){ 
				System.out.println ("*** Exception Erreur1 dans main") ;
			}catch (Erreur2 e){ 
				System.out.println ("*** Exception Erreur2 dans main") ;
			}
			catch (Erreur e){
				System.out.println ("*** Exception Erreur dans main") ;
			}
			System.out.println ("--------------") ;
		}
		System.out.println ("fin main") ;
	}
}
