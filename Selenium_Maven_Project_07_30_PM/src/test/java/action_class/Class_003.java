package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseClass.BaseClass;

public class Class_003 extends BaseClass{

	public static void main(String[] args) throws Exception {

		//drag and drop
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
	
		// perform drag and drop
		act.dragAndDrop(drag, drop).build().perform();
		take_screenshot("After Performed drag and drop");
	}

}
