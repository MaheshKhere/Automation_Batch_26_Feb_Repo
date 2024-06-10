package method;

public class Class_001 {

	public void x() {
		System.out.println("X Method from Parent Class");
	}
	public static void main(String[] args) {
		
		// Object 
		Class_001 cs = new Class_001();
		//cs.print(); // Access by ref variable
		
		//print(); // Access directly
		//print();
		
		// Access by Class Name
		Class_001.print();
	}
	
	// Static Method 
	public static void print() {
		System.out.println("Print Method from Parent Class");
	}
}
