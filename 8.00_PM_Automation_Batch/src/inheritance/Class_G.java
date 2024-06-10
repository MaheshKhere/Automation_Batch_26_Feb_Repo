package inheritance;

public class Class_G extends Class_F{

	public void g() {
		System.out.println("g() Method from Class_G");
	}
	public static void main(String[] args) {
		Class_G g = new Class_G();
		System.out.println(g.p); //Class_F Instance Variable
		g.f(); //Class_F Instance Method
	}
}
