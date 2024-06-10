package method;

public class Class_004 {
	//instance variable
	long l =500;
	
	//static variable
	static int i = 800000;
	

	public static void main(String[] args) {
		
		String s = "abc";
		System.out.println(s);
		
		Class_004 c4 = new Class_004();
		System.out.println(c4.l);
		
		// Access by reference variable
		System.out.println(c4.i);
		
		//Access Static variable By directly
		System.out.println(i);
		
		//Access by class name
		System.out.println(Class_004.i);
		
		
	}
}
