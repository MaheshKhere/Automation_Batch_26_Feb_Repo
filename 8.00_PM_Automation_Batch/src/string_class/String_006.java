package string_class;

public class String_006 {

	public static void main(String[] args) {

		// To Print character of string in forward direction-
		String m = "You Will do Great.!";
		for(int x =0; x<m.length(); x++) {
			System.out.print(m.charAt(x)+" ");
		}
		
		System.out.println();
		for(int y=m.length()-1; y>=0; y--) {
			System.out.print(m.charAt(y)+" ");
		}
		//System.out.println(m.length());
	}

}
