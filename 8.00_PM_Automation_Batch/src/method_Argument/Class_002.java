package method_Argument;

public class Class_002 {

	String s ;
	long l;
	
	public void assignValue(String ab, long k) {
		s = ab;
		l = k;
		System.out.println(s);
		System.out.println(l);
	}
	public static void main(String[] args) {
		Class_002 c2 = new Class_002();
		c2.assignValue("Automation", 12334);
		
	}
}
