package scanner_Class;

import java.util.Scanner;

public class Scanner_003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any one number");
		
	 int input = sc.nextInt();
	 System.out.println("Table Multiplication is:-");

	// 1x1=1 1x2 =2, 1x3=3, 1x4=4.......1x10=10
		for(int i = 1; i<=10; i++) {
			System.out.println(i*input);
			
			// OutputFormat-1 x 1 = 1
			//System.out.println(input+" * "+i+" = "+(i*input));
		}
	}
}
