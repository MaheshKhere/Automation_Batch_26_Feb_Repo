package interface_ex;

public class Follow_Traffic_Rule implements Traffic_Signal, Ab{

	
	public static void main(String[] args) {
		Follow_Traffic_Rule ftr = new Follow_Traffic_Rule();
		ftr.green();
		ftr.yellow();
		ftr.red();
		
		//Interface object- directly Can't
		//Traffic_Signal f = new Traffic_Signal();
		
		//Interface object-In-directly
		Traffic_Signal f = new Follow_Traffic_Rule();
	}

	@Override
	public void green() {
		System.out.println("Proceed With 60KMph");	
	}

	@Override
	public void yellow() {
		System.out.println("Proceed With 30KMph");	
	}

	@Override
	public void red() {
		System.out.println("Stop Here");	
	}

	@Override
	public void get() {
		
		
	}

	
}
