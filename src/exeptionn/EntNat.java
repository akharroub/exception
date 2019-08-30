package exeptionn;

public class EntNat {

	private int num;

	public EntNat(int num) throws ErrConst {
		if (num < 0) {
			ErrConst a = new ErrConst(num, "le entier n'est pas naturel ");
			throw a;
		}
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public static void main(String[] args) {
		EntNat e = null;
		try {
			e = new EntNat(-2);
			System.out.println("le Entier est naturel : "+e.getNum());
		} catch (ErrConst a) {
			System.err.println(a.getMessage());
		}
	}
}
