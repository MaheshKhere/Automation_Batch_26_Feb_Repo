package non_Access_Modifier;

public class Class_002 extends Class_001{

 int i =10;
	static long l= 400;
	
	public void a(int a) {
		
		i=a;
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		Class_002 c = new Class_002();
		c.a(2);
	}
}
