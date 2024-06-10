package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Map_002 {

	public static void main(String[] args) {

		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		
		//add values
		hs.put(1, "Pofare");
		hs.put(2, "Motghare");
		hs.put(3, "Motghare_1");
		hs.put(4, "Pofare_1");
		hs.put(4, "Pofare_12");

		
		//Print all values
		System.out.println(hs);
		
		//remove
		//hs.remove(3);
		//hs.remove(3, "Motghare_1");
		//System.out.println(hs);
		
		//create duplicate copy
		//System.out.println(hs.clone());
		
		//Replace Specific value
		hs.replace(1, "Ashvini Pofare");
		hs.replace(2, "Motghare", "Ashwini Motghare");
		//System.out.println(hs);
		
		// Remove all values
		//hs.clear();
		//System.out.println(hs);
	
	// To get value w.r.s key
		System.out.println(hs.get(4));
		
		// To check any value
		//System.out.println(hs.containsKey(200));
		//System.out.println(hs.containsValue("Ashvini Pofare"));
	
	
		// To Print values using iterator
		//Convert to set
		Set<Entry<Integer, String>> set = hs.entrySet();
	Iterator it = set.iterator();
	while(it.hasNext()) {
		 Entry map = (Map.Entry)it.next();
	System.out.println("Key is:- "+map.getKey());
	System.out.println("Value is:- "+map.getValue());
	}
	
	}

}
