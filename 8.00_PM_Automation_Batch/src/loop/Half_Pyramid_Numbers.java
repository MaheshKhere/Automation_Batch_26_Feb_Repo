package loop;

public class Half_Pyramid_Numbers {

	public static void main(String[] args) {
		
//		1 
//		1  2
//		1  2  3
//		1  2  3  4
//		1  2  3  4  5
		
//		for (int i= 1; i<=5; i++) {
//			for(int j=1;j<=i; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}

//		for(int i=1; i<=15;i++) {
//			for(int j =1;j<=i; j++ ) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//		
//		for(int i = 5; i>=1; i--) {
//			for(int j = 1; j<=i ;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//		for(int i= 1; i<=4; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		int num =1;
		for(int i=1 ; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
