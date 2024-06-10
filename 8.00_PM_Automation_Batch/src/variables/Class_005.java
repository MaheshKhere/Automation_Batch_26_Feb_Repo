package variables;

public class Class_005 {

	//static variable
	static long l = 700;
	
	//Instance method
	public void a() {
		//access static variable
		System.out.println(l);
		
	}
	
	//Static method
	public static void b() {
		System.out.println(l);
	}
	
	public static void main(String[] args) {
		
		// class object
		Class_005 c5 = new Class_005();
		
		System.out.println(l); // Access static variable directly
		
		//Access Static method directly
		b();
	}
}
