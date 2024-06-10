package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import baseClass.BaseClass;

public class Class_002 extends BaseClass{

	public static void main(String[] args) throws Exception {

		launch_browser("chrome");
		navigate_url("https://www.flipkart.com/");

		take_screenshot("Flipkart_HomePage");
		
		// locate search box
		driver.findElement(By.cssSelector("input.Pke_EE")).sendKeys("mobile");
		
		// Actions class- double click
		Actions act = new Actions(driver);
		Thread.sleep(2000);
act.doubleClick(driver.findElement(By.cssSelector("input.Pke_EE"))).build().perform();
	}

}
