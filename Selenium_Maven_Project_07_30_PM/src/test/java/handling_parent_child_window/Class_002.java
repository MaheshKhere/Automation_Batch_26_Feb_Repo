package handling_parent_child_window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class Class_002 extends BaseClass {

	public static void main(String[] args) throws Exception {
		launch_browser("chrome");
		navigate_url("https://www.naukri.com/");
		scroll_page(250);
		// Click MNC Link
		driver.findElement(By.xpath("//span[text()='MNC']")).click();
		
		// To Capture Window Id
		Set<String> window_id = driver.getWindowHandles();

		// Pull Window id
		Iterator<String> it = window_id.iterator();

		// To Shift Parent Window
		String parent_window_id = it.next();
		
		// To Shift Child Window
		String child_window_id = it.next();

		// Captured Window id's
		System.out.println("Parent Window id is:- " + parent_window_id);
		System.out.println("Child Window id is:- " + child_window_id);

		// Switch parent tab to child tab
		driver.switchTo().window(child_window_id);
		Thread.sleep(2000);
		// Click on Login Button
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		
		//click on HR Jobs
		//driver.findElement(By.xpath("//span[text()='HR Jobs']")).click();

	}

}
