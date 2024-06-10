package different_method_on_Web_Element;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_004 {

	public static void main(String[] args) {

		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		
		//current url
		System.out.println("Current url is :- "+driver.getCurrentUrl());
		
		//get title of web Page
		System.out.println("Title of Web Page is :- "+driver.getTitle());
		
		// locate text box
		WebElement email = driver.findElement(By.cssSelector("input#email"));
	 
		// pass input in Email Textbox
		email.sendKeys("maheshkhere11@gmail.com");
		
		// capture input of email Textbox
		System.out.println("Input Data of EmailTextbox is :-"+email.getAttribute("value"));
		
		
		// locate password and send input in it.
		driver.findElement(By.cssSelector("input#pass")).sendKeys("mahesh@123");

		
		
	}

}
