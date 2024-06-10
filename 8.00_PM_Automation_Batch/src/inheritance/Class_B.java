package inheritance;

//IS_A Relationship 

public class Class_B extends Class_A{

	double d= 60.45;
	int i = 9000;
	
	static long l = 80000; 
	
	public void b() {
		System.out.println("b Method");
	}
	
	public static void main(String[] args) {

		Class_B cb = new Class_B();
		
		System.out.println(cb.i); // Class_A
		cb.get_data(); //Class_A
		System.out.println(cb.d); //Class_B
		cb.b(); //Class_B
		System.out.println(cb.i); //Class_B
		System.out.println(l);//Class_B
	}

}
