package this_keyword;

public class This_001 {

	String s ;
	
	public void m1(String m) {
		
		//Access Instance Variable
		this.s=m;
		//System.out.println(m);
		//System.out.println(s);
		System.out.println(this.s);
		
	}
	public static void main(String[] args) {

		This_001 t = new This_001();
		t.m1("Java");
	}

}
