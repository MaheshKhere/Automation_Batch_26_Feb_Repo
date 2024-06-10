package scanner_Class;

import java.util.Scanner;

public class Scanner_002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your First Name");
		String first_name = sc.nextLine();
		System.out.println("Enter Your Last Name");

		String last_name = sc.nextLine();
		String surname = first_name + last_name;
		//System.out.println("Your Surname is:- "+first_name+" "+last_name);
		System.out.println("Your Surname is:- "+surname);
	}

}
