package problem;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Employee Name");
		String emp_name = sc.nextLine();
		
		System.out.println("Enter Basic Salary of Employee");
		double emp_basic_salary = sc.nextDouble();
	
	    // To Get HRA = 10% of Basic Salary
		double emp_hra = 0.1 * emp_basic_salary;
		
		//To Get DA = 20% of Basic Salary
		double emp_da = 0.2 * emp_basic_salary;
		
		//To Get Gross Salary
		double emp_gross_salary = emp_basic_salary+ emp_hra + emp_da;
	
		System.out.println("Employee Name Is:-"+emp_name);
		System.out.println("Employee Basic Salary Is:- "+emp_basic_salary);
		System.out.println("Employee House Rent Allowance Is:- "+emp_hra);
		System.out.println("Employee Dearness Allowance Is:-"+emp_da);
		System.out.println("Employee Gross Salary Is:- "+emp_gross_salary);
	
	}

}
