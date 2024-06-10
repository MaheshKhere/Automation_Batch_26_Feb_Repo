package scanner_Class;

import java.util.Scanner;

public class SCanner_001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1St Number");
		
		int input1 = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int input2 = sc.nextInt();
		
		int sum = input1 * input2 ;
		
		System.out.println("Multiplication of Above two Number is:- "+ sum);
		
	}

}
