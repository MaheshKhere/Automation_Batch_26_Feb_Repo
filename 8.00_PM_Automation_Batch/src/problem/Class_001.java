package problem;

public class Class_001 {
	
	public void get_emp_gross_salary(int salary, String emp_name) {
		System.out.println("Employee Name Is:- "+emp_name);
		System.out.println("Employee Basic Salary is:-"+salary);
		
		// To find value of HRA
		double hra = 0.1 * salary;
		System.out.println("Employee House Rent Allowance is:- "+hra);
	    
		// To find value of DA
		double da= 0.2 * salary;
		System.out.println("Employee Daily Allowance is:-"+da);
		
		// Assume 4% Tax
		double tax = 0.04 * salary;
		System.out.println("Employee Tax Deduction is:- "+tax);
		
		// To Find value of Gross Salary
		double gross_salary = salary +hra+da-tax;
		System.out.println("Employee Gross Salary is:-"+gross_salary);
	}
	public static void main(String[] args) {
		Class_001 c = new Class_001();
		c.get_emp_gross_salary(55000,"Mahesh Khere");
	}

}
