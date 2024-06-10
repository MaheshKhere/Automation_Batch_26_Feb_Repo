package super_keyword;

public class Super_004 extends Super_003{

	public void m1() {
		
	}
	public void paper() {
		super.scale(); // super_003
		System.out.println("Paper Method from Super_004");
		
        
	}
	public static void main(String[] args) {
		Super_004 s4 = new Super_004();
		s4.paper();
	}
}
