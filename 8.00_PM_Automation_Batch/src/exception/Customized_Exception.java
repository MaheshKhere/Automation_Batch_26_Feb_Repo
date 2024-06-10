package exception;


public class Customized_Exception {
	
	public void number() throws Exception {
		int i = 30;
		int r = i/2;
		System.out.println("hii");
		System.out.println(r);
		//System.out.println("hii");
		throw new Exception ("Number Can't Divide by zero ");
	}
	
	public static void main(String[] args) throws Exception {
		Customized_Exception c = new Customized_Exception();
		c.number();
		System.out.println("bye");
	}
}
