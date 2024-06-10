package array;

public class Array_002 {

	public static void main(String[] args) {

		String [] name = {"ab", "cd","ef","gh", "ij", "op"};
		
		//print values
		//System.out.println(name[0]);
		System.out.println("Length of Array is:- "+ name.length);
	
		//Print all values of array using for each Loop
//		for(String s : name) {
//			System.out.println(s);
//		}
		
		//Print values using for loop
		for(int i =0;i<6; i++) {
			System.out.println(name[i]);
		}
	}
}
