package constructor;

public class Constructor_004 {

//	//user-Defined Constructor 
	public Constructor_004 () {
		System.out.println("User Defined Constructor");
	}
	
	//Parameterized Constructor
	protected Constructor_004 (int a) {
		System.out.println("Parameterized Constructor");
		
	}
	Constructor_004 (String a) {
		System.out.println("Parameterized Constructor with String");
		
	}
	public static void main(String[] args) {
		Constructor_004 c = new Constructor_004();
		Constructor_004 c1 = new Constructor_004(2);
		Constructor_004 c2 = new Constructor_004("ab");

		
	}

}
