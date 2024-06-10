package exception;

public class Class_004 {

	public static void main(String[] args) {
		
		try {
//			Statement-1
//			Statement-2
//			Statement-3	
			Thread.sleep(399);
		}
		
		catch(Exception e) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
				System.out.println("bye");

			}
			
		}
		System.out.println("hii");

	}
}
