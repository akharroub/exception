package exeptionn;

public class ErrConst extends Exception {

	private static final long serialVersionUID = 1L;

	public ErrConst(int num, String strig) {
		super( "Error : l'entier n'est pas naturel : " + num);
	}

}
