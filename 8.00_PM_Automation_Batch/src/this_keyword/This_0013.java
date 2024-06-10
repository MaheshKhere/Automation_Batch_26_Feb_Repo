package this_keyword;

public class This_0013 {

	public This_0013() {
		System.out.println("Constructor with no Argument");
	}

	public This_0013(int i) {
		this();
		System.out.println("Constructor with one Argument");
	}

	public This_0013(int i, float f) {
		this(5);
		System.out.println("Constructor with two Argument");
	}

	public This_0013(float f, double d, long l) {
		this(8, 39.00f);
		System.out.println("Constructor with three Argument");

	}

	public This_0013(String s, int p, String r, int o) {
		this(45.787f,45.87,8989);
		System.out.println("Constructor with four Argument");
	}

	public static void main(String[] args) {
		This_0013 t = new This_0013("bn", 6, "qa", 9);

	}

}
