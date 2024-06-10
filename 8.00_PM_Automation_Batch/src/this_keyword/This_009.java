package this_keyword;

public class This_009 {
//Called 5 Constructor with highest parameterized Constructor Object
	public This_009() {
		this(6);
		System.out.println("Constructor with no Argument");
	}

	public This_009(int i) {
		this(90.0f, 9000);
		System.out.println("Constructor with one Argument");
	}

	public This_009(float f, long l) {
		this("abc", 78, 56);
		System.out.println("Constructor with two Argument");
	}

	public This_009(String s, int a, int w) {
		this(34.66, 500.9f, 6, 1);
		System.out.println("Constructor with three Argument");
	}

	public This_009(double d, float h, int p, int s) {
		System.out.println("Constructor with four Argument");
	}

	public static void main(String[] args) {
		This_009 t9 = new This_009();

	}
}
