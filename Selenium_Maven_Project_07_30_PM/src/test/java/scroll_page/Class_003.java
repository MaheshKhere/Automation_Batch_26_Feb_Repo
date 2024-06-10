package scroll_page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import baseClass.BaseClass;

public class Class_003 extends BaseClass {

	public static void main(String[] args) throws Exception {

		launch_browser("chrome");
		navigate_url("https://www.facebook.com/");
		take_screenshot("Facebook HomePage");

		// click on link
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		take_screenshot("After Click on Link");

		// Press Back Arrow
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.history.back()");

		Thread.sleep(4000);
		// Press Forward Arrow
		js.executeScript("window.history.forward()");

		// Press refresh Arrow
		js.executeScript("window.history.go(0)");

	}

}
