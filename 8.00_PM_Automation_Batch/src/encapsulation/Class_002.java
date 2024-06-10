package encapsulation;

public class Class_002 {

	private  long l = 30000;

	private void a(long k) {
		l = k;
		System.out.println(l);
	}

	public final static  void a() {
	
	}
	public static void main(String[] args) {
		Class_002 c2 = new Class_002();
		c2.a(200);
		
	}

}
