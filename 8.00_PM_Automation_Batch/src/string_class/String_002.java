package string_class;

public class String_002 {

	public static void main(String[] args) {

		  String s = "Java";
		  int r = s.length();
		  //System.out.println("Length of String :- "+r);
		  System.out.println("Length of String is :- "+s.length());
	
	//To replace some character from given string
		  String a = s.replace("v", "w");
		  System.out.println(a);
		  //System.out.println(s.replace("a", "b"));
		 // System.out.println(s.replace("a", "b"));
		  System.out.println(s.replaceFirst("a", "d"));
	}

}
