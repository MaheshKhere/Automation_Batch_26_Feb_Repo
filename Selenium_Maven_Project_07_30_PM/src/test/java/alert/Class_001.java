package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import baseClass.BaseClass;

public class Class_001 extends BaseClass {

	public static void main(String[] args) throws Exception {

		launch_browser("chrome");
		navigate_url("https://demoqa.com/alerts");
		scroll_page(100);

		// click on Alert button
		driver.findElement(By.cssSelector("button#alertButton")).click();
		Thread.sleep(3000);

		// Switch alert
		Alert al = driver.switchTo().alert();

		// Click ok button
		al.accept();


	}

}
