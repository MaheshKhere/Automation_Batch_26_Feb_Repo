package polymorphism;

public class Method_Overloading_003 {

//	public void page(int a) {
//		System.out.println("Page Method with int Argument");
//
//	}

//	public void page(long a) {
//		System.out.println("Page Method with long Argument");
//
//	}

//	public void page(float f) {
//		System.out.println("Page Method with float Argument");
//
//	}

	public void page(double d) {
		System.out.println("Page Method with double Argument");
	}

	public static void main(String[] args) {
		Method_Overloading_003 m = new Method_Overloading_003();
		m.page(1);
	}

}
