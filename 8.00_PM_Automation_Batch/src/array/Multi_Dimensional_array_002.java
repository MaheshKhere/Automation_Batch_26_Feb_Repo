package array;

public class Multi_Dimensional_array_002 {

	public static void main(String[] args) {

		// Declare without Memory Allocation-
		
		// a   b   c
		// d   e   f
		// g   h   i
		
		char [][] single_Character = 
			{{ 'a','b','c'}, {'d', 'e','f'},{'g','h', 'i'}};
		
		//System.out.println(single_Character[2][2]);
		
		for(int i= 0; i<=2; i++) {
			for(int j= 0; j<=2; j++) {
				System.out.print(single_Character[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
