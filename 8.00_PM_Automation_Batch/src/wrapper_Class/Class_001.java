package wrapper_Class;

public class Class_001 {

	public static void main(String[] args) {

		// Convert Primitive type to Wrapper Class-
		int i = 4500;
		Integer a = Integer.valueOf(i);
	  //System.out.println(a);
	  
	  float f = 3000.78f;
	  Float v = Float.valueOf(f);
	  //System.out.println(v);
	  
	  // Convert Wrapper class to Primitive type
	  Double d = new Double(5000.345);
	  double pmt_dbl = d.doubleValue();
	System.out.println(pmt_dbl);
	}

}
