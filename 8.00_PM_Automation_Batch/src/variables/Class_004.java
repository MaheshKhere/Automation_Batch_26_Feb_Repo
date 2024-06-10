package variables;

public class Class_004 {

	// Instance variable
	byte b = 100;

	// instance method
	public void print() {
		// Access instance variable directly
		System.out.println(b);

	}

	public static void main(String[] args) {
		Class_004 c4 = new Class_004();
		c4.print(); // Access Instance Method
		System.out.println(c4.b); // Access Instance Variable
	}
}
