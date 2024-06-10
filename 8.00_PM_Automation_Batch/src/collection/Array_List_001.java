package collection;

import java.util.ArrayList;

public class Array_List_001 {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		
		// Add values
		names.add("Ashvini_P");
		names.add("Ashwini_M");
		names.add("Ashwini_S");
		names.add("Vaibhav");
		names.add("Shruti");
		names.add("Aakansha");
		names.add("Abhinav");
		names.add("Nikita");
		names.add("Vaishnavi");
		names.add("Rahul");
		names.add("Dyaneshwar");
		names.add("Aakash");
		names.add("Poonam");
		names.add("Shubham");
		names.add(null);
		names.add("Shubham");
		names.add("abc");
		
		// Add values with index
		names.add(17,"def" );
		
		// To Print All values
		//System.out.println(names);
		
		// Print value with respect index
		//System.out.println(names.get(17));
		
		//Remove values
		//names.remove(17);
		//System.out.println(names);
		
		// To remove all values
		//names.clear();
		//System.out.println(names);
		
		// To check specific values
		System.out.println(names.contains("Poonam"));
		
		// To get index
		System.out.println(names.indexOf("Ashwini_S"));
		
		//To get size
		System.out.println(names.size());
		
		// create copy
		System.out.println(names.clone());

	}

}
