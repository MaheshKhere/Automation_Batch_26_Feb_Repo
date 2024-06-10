package string_class;

public class String_003 {

	public static void main(String[] args) {

		String s = new String ("Java-Automation........");
		String t = new String ("How?Are You?");

		//To get index/position of character-
		System.out.println("Index of Character is:-"+s.indexOf("A"));
		
		//To Get Substring(Some Characters)-
		System.out.println("Substring is :-"+s.substring(5));
		System.out.println("New String is:- "+s.substring(1, 15));
		
		//To Get character with respect to index-
		System.out.println(t.charAt(3));
		
	}

}
