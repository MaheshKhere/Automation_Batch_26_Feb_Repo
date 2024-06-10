package this_keyword;

public class This_0010 {

	String s = "cd";
	int j;

	public void get_variable(int z) {
		System.out.println(this.s);
		this.j = z;
		System.out.println(j);
	}
	
	public void java() {
		this.get_variable(5);
		System.out.println("Java Method  ");
	}

	public static void main(String[] args) {
		This_0010 t = new This_0010();
		//t.get_variable(7);
		//t.java();
	}

}
