package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSet_001 {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();
		HashSet<String> hs = new HashSet<String>();
		LinkedHashSet<Float> ls = new LinkedHashSet<Float>();
		
		// Add Values
		ts.add(10); ts.add(20);ts.add(30);ts.add(40);
		ts.add(50);ts.add(60);ts.add(70);ts.add(80);
		
		//To Print All Values
		//System.out.println(ts);
		
		// To Remove
		//ts.remove(70);
		//System.out.println(ts);

		//To Remove all values
		//ts.clear();
		//System.out.println(ts);

		// To Check specific value
		//System.out.println(ts.contains(30));
		
		//Create Duplicate copy
		//System.out.println(ts.clone());
	
		// To Print values using iterator
		Iterator<Integer> it = ts.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());	
        }
	}

}
