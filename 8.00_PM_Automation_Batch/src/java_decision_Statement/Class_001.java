package java_decision_Statement;

public class Class_001 {
	int i =89;
	
	public void print() {
		if (i<400) {
			System.out.println("i is less than 400");
		}
	}

	public static void main(String[] args) {
		Class_001 c1 = new Class_001();
		c1.print();
		
		int r = 300;
		
		// if statement
		if(r>500) {
			System.out.println("r is less than 500");
		}
		System.out.println("Condition is false");
	}
}
