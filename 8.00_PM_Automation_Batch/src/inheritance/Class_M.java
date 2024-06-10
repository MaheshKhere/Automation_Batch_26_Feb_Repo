package inheritance;

public class Class_M extends Class_J {

	public static void main(String[] args) {
		Class_M m = new Class_M();
		System.out.println(m.l); // Class_J Instance Variable
		m.j(); // Class_J Instance Method
	}
}
