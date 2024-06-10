package loop;

public class Inverted_half_pyramid_rotate_180 {

	public static void main(String[] args) {

//		Inverted half pyramid rotate 180
//          *
//       *  *
//    *  *  *
//  * *  *  *
		for(int i = 1; i<=4; i++) {
			
			// Print Spaces
			for(int j =1; j<=4-i;j++) {
				System.out.print(" ");
			}
			
			// To Print *
			for(int y=1; y<=i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
