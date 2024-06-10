package variables;

public class Class_002 {

	// static variable
	static String s = "Automation";
	
	
	public static void main(String[] args) {
		// directly Access Variable Static variable 
		System.out.println(s);
		
		// Access by class name
		System.out.println(Class_002.s);
		
		//Access by class Object
		Class_002 c2 = new Class_002();
		System.out.println(c2.s);	
	}
}
