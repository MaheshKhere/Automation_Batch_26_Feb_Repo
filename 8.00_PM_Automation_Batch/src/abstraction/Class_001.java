package abstraction;

public class Class_001 extends Class_002{

	@Override
	public void cd() {
		System.out.println("cd() from class_001");
	}

	@Override
	public void ef() {
		System.out.println("ef() from class_001");		
	}

	public static void main(String[] args) {
		Class_001 c = new Class_001();
		c.cd();
		c.ef(); 
		c.xy(); // Class_002
		op(); // Class_002
			
		//has-a Relationship
		//Class_002 c2= new Class();
	}
}
