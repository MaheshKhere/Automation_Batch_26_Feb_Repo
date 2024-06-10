package different_method_on_Web_Element;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_002 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		
		//Get current url
		System.out.println("Current url is :- "+driver.getCurrentUrl());
		
		//Get title Of web page
		System.out.println("Title of Web Page is :- "+driver.getTitle());
		
		// Locate Email text box
		driver.findElement(By.cssSelector("input#email")).sendKeys("abc");
	
	   // Locate Password Textbox
		driver.findElement(By.cssSelector("input#pass")).sendKeys("cd");

	    // clear email input
		driver.findElement(By.cssSelector("input#email")).clear();
	
		// Clear password input
		driver.findElement(By.cssSelector("input#pass")).clear();

	
	
	
	}

}
