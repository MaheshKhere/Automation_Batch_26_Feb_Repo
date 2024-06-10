package constructor;

public class Constructor_001 {

	// USer-Defined Constructor
	public Constructor_001() {
		System.out.println("User Defined Constructor_001");
		System.out.println("User Defined Constructor_002");
	}
	public static void main(String[] args) {
		Constructor_001 c1 = new Constructor_001();
		Constructor_001 c2 = new Constructor_001();
	}

}
