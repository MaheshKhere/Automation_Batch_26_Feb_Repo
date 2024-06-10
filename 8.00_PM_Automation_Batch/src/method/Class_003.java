package method;

public class Class_003 {

	// Static Method
	public static void b() {
		byte b = 100;
		System.out.println(b);
	}

	public static void main(String[] args) {

		// Access Directly
		b();
		
		//Access by Class Name
		Class_003.b();
		
		//Access by class object
		Class_003 c3 = new Class_003();
		c3.b();
	}
}
