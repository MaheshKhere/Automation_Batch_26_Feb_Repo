package different_method_on_Web_Element;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_003 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		
		//Get current url
		System.out.println("Current url is :- "+driver.getCurrentUrl());
		
		//get title of Web Page
		System.out.println("Title of Web Page is :- "+driver.getTitle());
		
		// click on link
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
	
		// capture link name
		System.out.println("Name of Link is :- "+link.getText());
				
		// Capture Attribute of An Element
		System.out.println("Attribute of an Element is :- "+link.getAttribute("href"));
		
		// Click on Link
		link.click();
		
		
		
		
	}

}
