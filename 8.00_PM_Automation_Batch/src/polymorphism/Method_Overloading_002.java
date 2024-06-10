package polymorphism;

public class Method_Overloading_002 {

//	public static void a(int i) {
//		System.out.println("a() Method with int Argument");
//	}

	public static void a(float f) {
		System.out.println("a() Method with float Argument");

	}

	public static void a(double d) {
		System.out.println("a() Method with double Argument");

	}

//	public static void a(long l) {
//		System.out.println("a() Method with long Argument");
//
//	}

	public static void a() {
		System.out.println("a() Method with no Argument");

	}

	public static void main(String[] args) {
		a();
		a(12); 
	}

}
