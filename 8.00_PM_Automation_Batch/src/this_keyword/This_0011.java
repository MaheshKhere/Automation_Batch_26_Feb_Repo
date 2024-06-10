package this_keyword;

public class This_0011 extends This_0010 {
	long l = 40;

	public void print() {
		System.out.println(this.s); // this_0010
		System.out.println(this.l); // this_0011
	}

	public void page() {
		this.get_variable(90); //This_0010
	}
	public static void main(String[] args) {
		This_0011 t = new This_0011();
		//t.print();
		t.page();
	}

}
