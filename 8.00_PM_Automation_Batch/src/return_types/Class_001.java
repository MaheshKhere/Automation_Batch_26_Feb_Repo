package return_types;

public class Class_001 {

	// 3.With return statement and no parameter
	public void get() {
		System.out.println("Get Method no parameter");
	return;
	}
	
	// 4.With return type and Parameter-
	public int get(int i) {
		System.out.println("Get Method With Parameter");
	return i;
	}
	
	public int get_data(int o) {
		System.out.println("Get_data Method");
	return 10;
	}
	
	public static String print(String name) {
		System.out.println("Your name is:- "+ name);
		return name;
	}
	
	public static void main(String[] args) {

		print("Mahesh");
		
		Class_001 c1 = new Class_001();
		c1.get_data(89);
		c1.get(2);
		c1.get();
	}

}
