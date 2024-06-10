package string_class;

public class String_004 {

	String s = "Nagpur";
	String w = "WARDHA";
	String p = "warora";
	String a = "";
	public static String r = "    Chandrapur    ";
	static String m ="given";

	public void get_string() {
		// To add another String in given string -
		System.out.println(s.concat(" Is Orange City"));
		System.out.println(s + " Big City");
	
		//To Make String in Lower Case -
		//System.out.println(w.toLowerCase());
		
		//To Make String in Upper Case -
	//System.out.println(p.toUpperCase());
	
	//To remove beginning and ending space from string-
	//System.out.print(r.trim());
	//System.out.print("cd");
	
	//To Check String empty or not-
	//System.out.println(a.isEmpty());
	
	//To Check characters which is present or not-
	System.out.println(m.contains("gv"));
	
	}

	public static void main(String[] args) {
		String_004 s = new String_004();
		s.get_string();
	}

}
