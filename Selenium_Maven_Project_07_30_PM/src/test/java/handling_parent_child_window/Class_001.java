package handling_parent_child_window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class Class_001 extends BaseClass {

	public static void main(String[] args) throws Throwable {
		launch_browser("chrome");
		navigate_url("https://www.salesforce.com/in");

		// Click watch demo
		driver.findElement(By.xpath("//a[@label='Watch demo']")).click();

		// To Capture Window Id
		Set<String> window_id = driver.getWindowHandles();

		// Pull Window id
		Iterator<String> it = window_id.iterator();

		// To Shift Parent Window
		String parent_window_id = it.next();

		// To Shift Child Window
		String child_window_id = it.next();

		System.out.println("Parent Window id is:- " + parent_window_id);
		System.out.println("Child Window id is:- " + child_window_id);

		// Switch parent tab to child tab
		driver.switchTo().window(child_window_id);

		Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[@id='UserFirstName-EA69']")).sendKeys("abc");
		// driver.findElement(By.cssSelector("input#UserFirstName-EA69")).sendKeys("Mahesh");
        //	WebElement work_email = driver.findElement(By.xpath("//input[@id='UserEmail-k2K6']"));
        //	work_email.click();
        //	work_email.sendKeys("maheshkhere@outlook.com");
	}

}
