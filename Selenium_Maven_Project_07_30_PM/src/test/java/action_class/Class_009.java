package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseClass.BaseClass;

public class Class_009 extends BaseClass {

	public static void main(String[] args) throws Exception {

		launch_browser("firefox");
		navigate_url("https://jqueryui.com/slider/");

		// to enter inside frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));

		// locate slider
		WebElement slider = driver.findElement(By.cssSelector("div#slider"));

		Actions act = new Actions(driver);

		// slider move forward x-axis - one way
		//act.dragAndDropBy(slider, 200, 0).build().perform();

		Thread.sleep(2000);
		
		// slider move in backward direction
		//act.dragAndDropBy(slider, -50, 0).build().perform();
		
		// slider move forward x-axis - Second way
		act.clickAndHold(slider).moveByOffset(100, 0).release().build().perform();

		// slider move in backward direction
		act.clickAndHold(slider).moveByOffset(-40, 0).release().build().perform();

	}

}
