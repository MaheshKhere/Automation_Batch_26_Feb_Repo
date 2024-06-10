package polymorphism;

public class Method_Overriding_002 extends Method_Overriding_001{

	 public  void z() {
		System.out.println("z() Method From Method_Overriding_002");
	}
	
	 public static void y() {
			System.out.println("y() Method From Method_Overriding_001");
		}
	 
	 
	public static void main(String[] args) {
		Method_Overriding_002 m = new Method_Overriding_002();
		m.z();
	}

}
