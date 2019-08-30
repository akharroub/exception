package exoEnt;

import java.util.Scanner;

import exeptionn.ErrConst;

public class programme {

	public static void main(String[] args) throws ErrConst {
		
		Scanner sn = new Scanner(System.in);
		System.out.println("saisissez un entier positife : ");
		try {
			EntNat a = new EntNat(sn.nextInt());
			System.out.println("saisessez un entier positife : ");
			EntNat b = new EntNat(sn.nextInt());
			EntNat resSom = EntNat.somme(a, b);
			System.out.println("la somme "+resSom.getN());
			EntNat resDef = EntNat.differance(a, b);
			EntNat resPro = EntNat.produit(a, b);
		} catch (ErrNat e) {
			System.out.println(e.getMessage());
		}
		  System.out.println("suite du programme ***************************");
		  System.out.println("Saisissez un entier positif : ");
		  try {
			  EntNat a = new EntNat(sn.nextInt());
	            System.out.println("Saisissez un entier positif : ");
	            EntNat b = new EntNat(sn.nextInt());
	            EntNat resSom = EntNat.somme(a, b);
				EntNat resDef = EntNat.differance(a, b);
				EntNat resPro = EntNat.produit(a, b);
		} catch (ErrConst | ErrSom | ErrDiff | ErrProd  e) {
			System.out.println(e.getMessage());
		}
	}

}
