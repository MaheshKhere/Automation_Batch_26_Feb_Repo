package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set_001 {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		
		//add values
		hs.add(20);
		hs.add(30);
		hs.add(40);hs.add(50);hs.add(60);hs.add(70);
		hs.add(null);
		//to print values
		System.out.println(hs);
		
		//Remove value
		hs.remove(60);
		
		System.out.println(hs);

		// Remove all
		//hs.clear();
		System.out.println(hs);

	    // Create duplicate copy
		System.out.println(hs.clone());
		
		System.out.println(hs.size());
		
		// to print all values using iterator
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
