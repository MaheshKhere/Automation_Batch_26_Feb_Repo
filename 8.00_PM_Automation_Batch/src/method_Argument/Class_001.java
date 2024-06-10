package method_Argument;

public class Class_001 {
	// Instance Variable
	int i;
	String a;

	// instance method
	public void assign_value(int a) {
		// Assign value to instance variable
		i = a;
		System.out.println(i);
		System.out.println(a);

	}

	public static void main(String[] args) {
		Class_001 c1 = new Class_001();
		c1.assign_value(78);
		System.out.println();
		System.out.println();
	}

}
