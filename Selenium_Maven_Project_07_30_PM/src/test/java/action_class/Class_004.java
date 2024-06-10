package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseClass.BaseClass;

public class Class_004 extends BaseClass {

	public static void main(String[] args) throws Exception {

		launch_browser("chrome");
		navigate_url("https://www.globalsqa.com/demo-site/draganddrop/");
		take_screenshot("Homepage_gloabalsqa");

		// locate frame
		// driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));

		// enter inside frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));

		// locate drag- image-1
		WebElement drag_1 = driver.findElement(By.xpath("//h5[text()='High Tatras']"));

		// locate image-2
		WebElement drag_2 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));

		// locate image-3
		WebElement drag_3 = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));

		// locate image-4
		WebElement drag_4 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));

		// locate drop element
		WebElement drop = driver.findElement(By.xpath("//span[text()='Trash']"));

		// action class
		Actions act = new Actions(driver);

		Thread.sleep(2000);
		// Performed Drag and drop - one way
//		act.dragAndDrop(drag_1, drop).build().perform();
//		act.dragAndDrop(drag_2, drop).build().perform();
//		act.dragAndDrop(drag_3, drop).build().perform();
//		act.dragAndDrop(drag_4, drop).build().perform();

		// Performed Drag and drop - Second way
		act.clickAndHold(drag_1).moveToElement(drop).build().perform();
		act.clickAndHold(drag_2).moveToElement(drop).build().perform();
		act.clickAndHold(drag_3).moveToElement(drop).build().perform();
		act.clickAndHold(drag_4).moveToElement(drop).build().perform();


	}

}
