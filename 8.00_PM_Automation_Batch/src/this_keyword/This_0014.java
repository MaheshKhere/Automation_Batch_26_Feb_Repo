package this_keyword;

public class This_0014 {
	
	public This_0014() {
		this(3);
		System.out.println("Constructor with no Argument");
	}

	public This_0014(int i) {
		this(1, 3.90f);
		System.out.println("Constructor with one Argument");
	}

	public This_0014(int i, float f) {
		this(6.0f,5.00,999);
		System.out.println("Constructor with two Argument");
	}

	public This_0014(float f, double d, long l) {
	this("a",20,"f",4);
		System.out.println("Constructor with three Argument");

	}

	public This_0014(String s, int p, String r, int o) {
		System.out.println("Constructor with four Argument");
	}

	public static void main(String[] args) {
		This_0014 t = new This_0014();
	}

}

