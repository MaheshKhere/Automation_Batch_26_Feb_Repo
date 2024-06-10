package polymorphism;

public class Method_Overriding_008 extends Method_Overriding_007 {

	public void print() {
		System.out.println("Print Method From Method_Overriding_008");
	}

	public int go(int x) {
		System.out.println("Go Method From Method_Overriding_008");
		return x;
	}

	public Number name(int f) {
		System.out.println("name Method From Method_Overriding_008");
		return f;
	}

	public Long get(long l) {
		System.out.println("get Method From Method_Overriding_008");
		return l;
	}

	public static void main(String[] args) {
		Method_Overriding_008 m = new Method_Overriding_008();
		// m.print();

		// has-a Relationship
		Method_Overriding_007 m2 = new Method_Overriding_007();
		// m2.print();

		// property-03
		Method_Overriding_007 m3 = new Method_Overriding_008();
		m3.print();
	}
}
