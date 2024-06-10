package string_class;

public class String_009 {

	public static void main(String[] args) {

		String s = "Ashwini Motghare";
		String[] a = s.split("=");
		
		// Print values
		//System.out.println(a[0]);
		//System.out.println(a[1]);
		//System.out.println(s);

		String s1 = "AshuMotghatre.....0987567";
		String[] d = s1.split("t");
		//System.out.println(d[0]);
		//System.out.println(d[1]);
		
		// To print all values-for each loop
		for(String w:d) {
			System.out.println(w);
		}
	}

}
