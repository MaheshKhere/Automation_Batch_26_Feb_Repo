package interface_ex;

public class Class_001 implements Xy, Ab{

	@Override
	public void time() {
		
	}

	@Override
	public void get() {
		
	}

	public static void main(String[] args) {
		// directly
		//Xy y = new Xy();
		
		// indirectly
		Xy y = new Class_001();
	}
}
