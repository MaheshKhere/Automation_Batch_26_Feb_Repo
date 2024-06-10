package array;

public class Array_001 {

	public static void main(String[] args) {
		//Declare by allocating Memory-
		//int [] mark = new int [9];
		
		int mark []= new int[5];
		
		// insert values
		mark[0]= 35;
		mark[1]= 40;
		mark[2]= 60;
		mark[3]= 70;
		mark[4]= 99;

		
		//Print Array values
		System.out.println(mark[4]);
		System.out.println(mark[2]);
		System.out.println(mark[1]);
		System.out.println(mark[3]);
		System.out.println(mark[0]);
	
		//length of array
		System.out.println("Length of Array is:- "+mark.length);
		
	
	}

}
