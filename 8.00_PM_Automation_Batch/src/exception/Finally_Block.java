package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Finally_Block {

	public static void main(String[] args) {

 try {
	FileInputStream fis = new FileInputStream("a");
} catch (FileNotFoundException e) {
	e.printStackTrace();
}
 
 //Finally Block
 finally {
	System.out.println("finally block");
}
	}

}
