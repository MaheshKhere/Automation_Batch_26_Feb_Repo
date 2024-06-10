package select_class;

import java.awt.ScrollPane;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import baseClass.BaseClass;

public class Practice extends BaseClass{

	public static void main(String[] args) {

		launch_browser("chrome");
		navigate_url("https://formstone.it/components/dropdown/demo/");
scroll_page(500);

Select s = new Select(driver.findElement(By.cssSelector("select#demo_multiple")));

s.selectByVisibleText("One");
//s.selectByVisibleText("Two");
	}

}
