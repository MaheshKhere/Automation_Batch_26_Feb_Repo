package java_decision_Statement;

public class Nested_if {

	public static void main(String[] args) {
		
		long l=2000;
		
		if(l==2000) {
			System.out.println("Number is equal to 2000");
		if(l>3000) {
			System.out.println("Number is less than 3000");
		}else {
			System.out.println("Condition 2 is false");
		}
		if(l>500) {
			System.out.println("Number is greater than 500");
		}
		}else {
			System.out.println("All Condition is false");
		}

	}

}
