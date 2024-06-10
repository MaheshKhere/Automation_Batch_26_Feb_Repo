package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseClass.BaseClass;

public class Class_005 extends BaseClass{

	public static void main(String[] args) throws Exception {
		launch_browser("chrome");
		navigate_url("https://jqueryui.com/droppable/");
		take_screenshot("Homepage_Jquery");
		
		// locate frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	
		// To enter inside frame
		driver.switchTo().frame(frame);
		
		// locate drag element
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
	
		//Locate drop element
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
	
		//Actions Class
		Actions act = new Actions(driver);
		
		// another way to perform drag and drop
		//act.clickAndHold(drag).moveToElement(drop).release().build().perform();
	
		// to come out from  frame
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
	    // click on link
		//driver.findElement(By.xpath("//a[text()='Draggable']")).click();
	
	}

}
