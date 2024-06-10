package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import baseClass.BaseClass;

public class Class_002 extends BaseClass {

	public static void main(String[] args) throws Exception {
		launch_browser("chrome");
		navigate_url("https://demoqa.com/alerts");
		scroll_page(200);

		// Click on Confirm Alert
		driver.findElement(By.cssSelector("button#confirmButton")).click();
		Thread.sleep(3000);

		// Switch alert
		Alert al = driver.switchTo().alert();

		// click on cancel button
		al.dismiss();
	}

}
