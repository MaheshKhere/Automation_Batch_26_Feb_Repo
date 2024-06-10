package inheritance;

public class Class_I extends Class_H{

	public void i() {
		System.out.println("i() Method from Class_I");
	}
	public static void main(String[] args) {
		Class_I i = new Class_I();
		
		System.out.println(i.p); //Class_F Instance Variable
		i.f(); // Class_F Instance Method
		i.g(); // Class_G Instance Method
		i.h(); //Class_H Instance Method
		i.i(); //Class_I Instance Method
	}

}
