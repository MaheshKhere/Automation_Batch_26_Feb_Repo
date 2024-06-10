package java_decision_Statement;

public class Else_if_ladder {

	public static void main(String[] args) {
		
		// dated-21-03-2024
		
		int i =90;
		
		if (i>100) {
			System.out.println("Condition -1");
		}else if(i<80&&i>60) {
			System.out.println("Condition-2");
		}else if (i!=90) {
			System.out.println("Condition-3");
			
		}else if (i<5) {
			System.out.println("Condition-4");
		}
		else {
			System.out.println("All Condition is False");
		}
	}

}
