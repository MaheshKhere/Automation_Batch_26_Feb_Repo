package select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseClass.BaseClass;

public class Class_002 extends BaseClass {

	public static void main(String[] args) throws Exception {
		launch_browser("chrome");
		navigate_url("https://www.jeevansathi.com/");

		Thread.sleep(3000);
		
		// Click on dropdown
		WebElement dropdown = driver.findElement(By.xpath("//div[@id='relationshipBlock']"));
		dropdown.click();
		
        // locate all options
		List<WebElement> options = driver.findElements(By.xpath("//div[@id='relationshipOptions']/ul/li"));

		// Find out no of options
		System.out.println(options.size());
		
		// choose one option from seven 
		for(int i=0; i<7; i++) {
			if(options.get(i).getText().equalsIgnoreCase("Sister")) {
				options.get(i).click();
			}
		}
		
		// Capture Selected option
		System.out.println("Selected Option is:- "+dropdown.getAttribute("value"));
		
		}
}
	