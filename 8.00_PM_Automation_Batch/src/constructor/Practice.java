package constructor;

public class Practice {
	int a;
	String s;

	public Practice() {
System.out.println(this.a);
	}

	public Practice(int d) {
		this.a = d;
		System.out.println(this.a);
		
	}

	public static void main(String[] args) {
		Practice p = new Practice();
		//System.out.println(p.a);
		//System.out.println(p.s);
		
		Practice p1 = new Practice(100);
		//System.out.println(p1.a);
		//System.out.println(p1.s);
		
		
	}

}
