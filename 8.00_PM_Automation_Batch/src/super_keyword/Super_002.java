package super_keyword;

public class Super_002 extends Super_001{

	public float f = 2.001f;
	
	//Super keyword
	public void get_variable() {
		//Variable from parent class
		//System.out.println(super.f);
		System.out.println(super.f);
	}
	
	public static void main(String[] args) {
		Super_002 s = new Super_002();
		s.get_variable();	
	}
}
