package string_class;

public class String_008 {

	public static void main(String[] args) {

		// Break String with Character
		String j = "character";
		
		String[] n = j.split("a");
		
		// for each loop
		for(String pr : n) {
			System.out.println(pr);
		}
	}

}
