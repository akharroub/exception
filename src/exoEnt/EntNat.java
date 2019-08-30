package exoEnt;

import exeptionn.ErrConst;

public class EntNat {
	private int n;

	public EntNat(int num) throws ErrConst {
		if (n < 0) {
			ErrConst a = new ErrConst(n, "le entier n'est pas naturel ");
			throw a;
		}
		this.n = num;
	}

	public int getN() {
		return this.n;
	}

	public static EntNat somme(EntNat n1,EntNat n2) throws ErrSom, ErrConst{
		int a = n1.getN() ;// n1 + n2
		int b = n2.getN();
		int som = a+b;

		if(som > Integer.MAX_VALUE ) {
			throw new ErrSom(a,b);
		}
		return new EntNat(som);
	}

	public static EntNat differance(EntNat n1,EntNat n2) throws ErrDiff, ErrConst {
		int a = n1.getN() ;
		int b = n2.getN();
		int dif = a-b;

		if(dif < 0) {
			throw new ErrDiff(a,b);
		}
		return new EntNat(dif);

	}
	public static EntNat produit(EntNat n1,EntNat n2) throws ErrProd, ErrConst{
		int a = n1.getN() ;
		int b = n2.getN();
		int pro = a+b;
		try {
			if(pro > Integer.MAX_VALUE )throw new ErrSom(a,b);
		} catch (ErrSom e) {
			System.err.println(" Erreur produit");
		}
		return new EntNat(pro);
	}

}
