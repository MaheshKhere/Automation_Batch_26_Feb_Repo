package file_upload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class Class_001 extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		launch_browser("chrome");
		navigate_url("https://www.ilovepdf.com/word_to_pdf");
		
		// Click on upload file
		driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
		
		// To select desired file
		StringSelection s = new StringSelection("\"C:\\Users\\HP\\Desktop\\Automation Applications\\JE P-way Questions.docx\"");
		
		// Copy File location
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		// Robot Class
		Robot r = new Robot();
		
		r.delay(3000);
		
		// Press Control v
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		// release Control v
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		//Press Enter button
		r.keyPress(KeyEvent.VK_ENTER);
		
		//Release Enter Button
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		// Click on convert to pdf button
		driver.findElement(By.xpath("//span[text()='Convert to PDF']")).click();
	}
}

