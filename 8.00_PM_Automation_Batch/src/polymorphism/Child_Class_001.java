package polymorphism;

public class Child_Class_001 extends Parent_Class_001{

	public void go(String s) {
		System.out.println("s() Method from Child Class with string Variable is:-"+s);
	}
	public void get() {
		System.out.println("get() Method from Child Class");
	}
	
	public static void main(String[] args) {
		Child_Class_001 c = new Child_Class_001();
		//c.go("ab");
		//c.get();
		
		//Has-a Relationship
		Parent_Class_001 p = new Parent_Class_001();
		//p.get();
		
		//Property-03
		Parent_Class_001 p2 = new Child_Class_001();
		p2.go("cd");
		p2.get();
		
		
		
		
		
	}
}
