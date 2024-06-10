package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseClass.BaseClass;

public class Class_0011 extends BaseClass{

	public static void main(String[] args) throws Exception {

		launch_browser("chrome");
		navigate_url("https://www.facebook.com");
		
		
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		email.sendKeys("abs");
		 
		Actions act = new Actions(driver);
		//act.moveToElement(email).keyDown(Keys.SHIFT).sendKeys("abc").build().perform();
		
		act.moveToElement(email).build().perform();
		  Thread.sleep(2000);
		act.sendKeys(Keys.TAB).build().perform();
	}

}
