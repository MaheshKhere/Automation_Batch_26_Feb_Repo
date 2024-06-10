package array;

public class Multi_Dimensional_array_001 {

	public static void main(String[] args) {
		
		// 10  20  30
		// 40  50  60
		// 70  80  90
		int [] [] number = new int[3][3];
		
		// insert values
		number[0][0]= 10;
		number[0][1]= 20;
		number[0][2]= 30;
		number[1][0]= 40;
		number[1][1]= 50;
		number[1][2]= 60;
		number[2][0]= 70;
		number[2][1]= 80;
		number[2][2]= 90;
		
		//System.out.println(number[1][2]);
		
		//Print All Values- Nested Loop
		for(int i = 0; i<3 ; i++) {
			//column increment
			for (int j= 0; j<3; j++) {
				System.out.print("["+i + "]["+j+ "] = "+number[i][j]+" ");
			}
			System.out.println();
		}
		
//		for(int i[]:number) {
//			for (int x : i) {
//				System.out.println( x);
//			}
//		}
		
		
	}

}
