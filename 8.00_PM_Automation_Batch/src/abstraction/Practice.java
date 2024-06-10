package abstraction;

public class Practice {

	public void a() {
		
		//Declare by allocating Memory-
		int [] a = new int [5];
		//insert Values 
		a[0]=29;
		a[1]=39;
		a[2]=45;
		a[3]=35;
		a[4]=70;
		
		//Print values
		System.out.println(a[2]);
	}
	
	
	public static void array() {
		float f [] = {1.03f,20.89f, 30.90f, 40.90f};
		
		// for each loop
//		for(float r :f) {
//			System.out.println(r);
//		}
		
		//for loop
		for(int i =0 ;i<=3; i++) {
			System.out.println("f[" +i +"] = "+f[i]);
			//f[0] = 1.03
		}
	}
	public static void main(String[] args) {
		Practice p = new Practice();
		//p.a();
		array();
	}

}
