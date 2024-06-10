package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Set_001 {

	public static void main(String[] args) {

		TreeSet<String> t = new TreeSet<String>();
		// add values
		t.add("ab");
		t.add("cd");
		t.add("ef");
		t.add("gh");
		t.add("ij");
		t.add("kl");
		t.add("kl");

		// values print
		System.out.println(t);

		// Remove
		t.remove("ab");
		System.out.println(t);

		// Remove all
		// t.clear();
		// System.out.println(t);

		// duplicate copy
		System.out.println(t.clone());
		System.out.println(t.contains("gh"));

		// Print all Values
		Iterator<String> it = t.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
