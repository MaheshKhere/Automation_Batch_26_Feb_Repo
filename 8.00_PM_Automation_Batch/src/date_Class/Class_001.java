package date_Class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Class_001 {

	public static void main(String[] args) {

		Date d = new Date();
		String current_date = d.toString();
	System.out.println(current_date);
	
	//dd/mm/yyyy hh:mm:ss
	Date d1 = new Date();
	Date d2 = new Date();
	SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	
	SimpleDateFormat sm1 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

	System.out.println(sm1.format(d2));
	System.out.println(sm.format(d2));

	}

}
