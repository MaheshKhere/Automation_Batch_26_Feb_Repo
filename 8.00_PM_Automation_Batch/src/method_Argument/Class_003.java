package method_Argument;

public class Class_003 {
	int a;
	int b;
	static int v;

	public void x(int n, int r) {
		v = r;
		a = n;
	}

	public void y(int m) {
		b = m;

	}

	public void print_value() {

		System.out.println("The Value of Instance variable a is:- " + a);
		System.out.println("The value of Instance variable b is:- " + b);
		System.out.println("The value of Static Variable v is:- " + v);
	}

	public static void main(String[] args) {

		Class_003 c3 = new Class_003();
		c3.x(25, 75);
		c3.y(50);
		c3.print_value();

	}
}
