package inheritance;

public class Class_D extends Class_C{

	public void y() {
		System.out.println("Y Method");
	}
	
	public static void main(String[] args) {
		
		// Property-02-Has_A Relationship
		Class_C c = new Class_C();
		c.go();
		c.print();
		
		// Property-03-Parent class ref variable hold child class object
		Class_C c1 = new Class_D();
		c1.print();
		go();
		
		// Property-4
	//	Class_D c2 = new Class_C();
	}
}
