package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Map_001 {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// Add Values
		hm.put(0, "ab");
		hm.put(1, "cd");
		hm.put(5, "ef");
		hm.put(6, "gh");
		hm.put(7, "ij");
		hm.put(10, null);
		// hm.put(0, "kl");

		// To Print values
		System.out.println(hm);

		// To remove value
		// hm.remove(7);
		// hm.remove(5, "ef");
		// System.out.println(hm);

		// To Replace one value
		// hm.replace(1, "xy");
		// hm.replace(5, "ef", "st");
		// System.out.println(hm);

		// To get Value with respect to index
		System.out.println(hm.get(6));

		// To get Size
		System.out.println(hm.size());

		// To Search any key
		System.out.println(hm.containsKey(7));

		// To Search any value
		System.out.println(hm.containsValue("ab"));

		// Create duplicate copy
		// System.out.println(hm.clone());

		// To remove all Values
		//hm.clear();
		// System.out.println(hm);

		// To Print all values using iterator
		// convert hashmap to set

		Set<Entry<Integer, String>> s = hm.entrySet();
		Iterator it = s.iterator();
		while (it.hasNext()) {
			
			Map.Entry m = (Map.Entry) it.next();
			System.out.println("Key is:- " + m.getKey());
			System.out.println("value is:- " + m.getValue());
		}
	}
}
