package this_keyword;

public class This_007 {

	public This_007 () {
		System.out.println("Constructor with no argument");
		
	}
	
	public This_007 (String s) {
		this();
		System.out.println("Constructor with one argument");
	}
	public static void main(String[] args) {
		This_007 t1 = new This_007("ab");

		
	}

}
