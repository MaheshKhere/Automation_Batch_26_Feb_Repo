package inheritance;

public class Class_H extends Class_G{

	public void h() {
		System.out.println("h() Method from Class_H");
	}
	public static void main(String[] args) {
		Class_H h = new Class_H();
		System.out.println(h.p); //Class_F Instance Variable
		h.f(); //class_F Instance Method
		h.g(); //Class_G Instance Method
	}

}
