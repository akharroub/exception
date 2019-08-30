package exo5;

public class A {

	public A(int n) throws Erreur{
		try{ 
			if(n==1) throw new Erreur1() ;
			if (n==2) throw new Erreur2() ;
			if (n==3) throw new Erreur() ;
		}catch (Erreur1 e)
		{ System.out.println ("** Exception Erreur1 dans constructeur A") ;
		}catch (Erreur e){ 
			System.out.println ("** Exception Erreur dans constructeur A") ;
			throw (e) ;
		}
	}
}

