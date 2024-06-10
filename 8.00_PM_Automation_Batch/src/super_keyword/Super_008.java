package super_keyword;

public class Super_008 extends Super_007{

	public Super_008 () {
		super(2);
		System.out.println("Constructor with one argument from super_008");
	}
	
	public static void main(String[] args) {
		Super_008 s8 = new Super_008();
	}
}
