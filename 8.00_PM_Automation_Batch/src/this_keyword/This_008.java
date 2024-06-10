package this_keyword;

public class This_008 {

	public This_008() {
		System.out.println("Constructor with no Argument");
	}

	public This_008(int i) {
		this();
		System.out.println("Constructor with one Argument");
	}

	public This_008(float f, long l) {
		this(3);
		System.out.println("Constructor with two Argument");
	}

	public This_008(String s, int a, int w) {
		this(50.90f, 4000);
		System.out.println("Constructor with three Argument");
	}

	public This_008(double d, float h, int p, int s) {
		this("ab",900, 1000);
		System.out.println("Constructor with four Argument");
	}

	public static void main(String[] args) {
		This_008 t8 = new This_008(60.90, 390.99f,100, 5);
		
	
	}
}
