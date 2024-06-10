package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import baseClass.BaseClass;

public class Class_003 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		launch_browser("chrome");
		navigate_url("https://demoqa.com/alerts");
		scroll_page(200);

		// Click on Prompt button
		driver.findElement(By.cssSelector("button#promtButton")).click();
		Thread.sleep(3000);

		// Switch alert
		Alert al = driver.switchTo().alert();

		// send input in Prompt Alert
		al.sendKeys("mahesh");

		// Click on Ok Button
		al.accept();
	}

}
