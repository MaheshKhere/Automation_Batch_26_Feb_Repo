package non_Access_Modifier;

public  class Class_001 {
	public Class_001() {
		System.out.println("constructor");
	}
	//Static block
	static {
		System.out.println("Static Block");
	}
	
	public final void m1() {
		System.out.println("m1");
	}
	
	
	public static void main(String[] args) {
		Class_001 c = new Class_001();
		c.m1();
	}
}
