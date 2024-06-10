package polymorphism;

public class Method_Overloading_001 {

	public void b(int a) {
		System.out.println("b() Method with int data Type");
	}

	public void b(float f) {
		System.out.println("b() Method with float data Type");
	}

	public void b(int a,float f) {
		System.out.println("b() Method with float data Type");
	}
	
	public void b() {
		System.out.println("b() Method with no data Type");
	}

	public void b(String s) {
		System.out.println("b() Method with String data Type");

	}

	public static void main(String[] args) {
		Method_Overloading_001 mo = new Method_Overloading_001();
		mo.b();
		mo.b("ab");
		mo.b(123);
		mo.b(12.0056f);
	}

}
