package exception;

public class Class_003 {

	public void a() throws InterruptedException {
		Thread.sleep(500);
	}
	public static void main(String[] args)  {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			
		}
		catch (Exception e) {
		
		}
	}

}
