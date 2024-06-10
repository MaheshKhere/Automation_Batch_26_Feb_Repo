package string_class;

public class String_005 {

	public static void main(String[] args) {
    // To Compare two string which is equal or not

		String a = "ab";
		String b = "cd";
		System.out.println(a.equals("ab"));
		
		// To ignore case b/t two String-
		String ab = "TRAIN";
		String xy = "train";
		System.out.println(ab.equalsIgnoreCase("TraIN"));
	
	 String op = "Sunday";
	 System.out.println(op.endsWith("y"));
	 
	 System.out.println(op.charAt(4));
	}

}
