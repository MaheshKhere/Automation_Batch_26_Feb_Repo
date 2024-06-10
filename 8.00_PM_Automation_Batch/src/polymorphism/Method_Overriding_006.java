package polymorphism;

public class Method_Overriding_006 extends Method_Overriding_005{

	
	public Number data(int a) {
		System.out.println("data () Method from Method_Overriding_006");
	return 100;
	}
	
	public Integer m1(int a) {
		System.out.println("m1 () Method from Method_Overriding_006");
	return 10;
	}
	public static void main(String[] args) {
		Method_Overriding_006 m = new Method_Overriding_006();
		m.data(2);
		m.m1(1);
	}

}
