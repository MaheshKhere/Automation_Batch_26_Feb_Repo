package polymorphism;

public class Method_Overriding_004 extends Method_Overriding_003 {

	public long get(long l) {
		System.out.println("l() Method from Method_Overriding_004");
		return l;
	}

	public static void main(String[] args) {
		Method_Overriding_004 m = new Method_Overriding_004();
		m.get(89);
	}

}
