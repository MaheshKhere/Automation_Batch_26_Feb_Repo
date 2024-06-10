package select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class Class_003 extends BaseClass{

	public static void main(String[] args) throws Exception {

		launch_browser("chrome");
		navigate_url("https://www.jeevansathi.com/");

		Thread.sleep(3000);
		
		// Click on dropdown
		WebElement dropdown = driver.findElement(By.xpath("//div[@id='relationshipBlock']"));
		dropdown.click();
		
		// Click brother option
		driver.findElement(By.xpath("(//div[@id='relationshipOptions']//li)[4]")).click();
		
		//System.out.println("Selected Option is:- "+dropdown.getAttribute("value"));
	
		String option_name= driver.findElement(By.xpath("//div[@id='relationship']")).getAttribute("value");
	
		System.out.println("Selected Option is :- "+option_name);
	}
}
