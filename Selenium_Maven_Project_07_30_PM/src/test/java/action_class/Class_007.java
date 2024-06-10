package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import baseClass.BaseClass;

public class Class_007 extends BaseClass{

	public static void main(String[] args) {

	   launch_browser("chrome");
	    navigate_url("https://www.facebook.com");
		
		//current url
		System.out.println("Current url is :- "+driver.getCurrentUrl());
		
		//get title of web Page
		System.out.println("Title of Web Page is :- "+driver.getTitle());
		
		// locate email text box
		WebElement email = driver.findElement(By.cssSelector("input#email"));
	 	
		// Actions Class
		Actions act = new Actions(driver);
		
		// pass input in uppercase
		act.keyDown(Keys.SHIFT).sendKeys("mahesh").build().perform();
		//act.sendKeys(email, Keys.SHIFT).sendKeys("mahesh").build().perform();
	}

}
