package dynamic_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class Irctc_002 extends BaseClass {

	public static void main(String[] args) throws Exception {

		launch_browser("chrome");
		navigate_url("https://www.irctc.co.in/");

		// Locate From City and send city name
		WebElement from_city = driver
				.findElement(By.xpath("//span[@class='ng-tns-c57-8 ui-autocomplete ui-widget']//input"));
		from_city.sendKeys("nashik");

		// Locate all Option
		List<WebElement> from_city_options = driver.findElements(By.xpath("//ul[@id='pr_id_1_list']/li"));
		//List<WebElement> from_city_options = driver.findElements(By.xpath("//ul[@id='pr_id_1_list']/li/span/span"));
		
		// Select One option
		for (int i = 0; i < from_city_options.size(); i++) {
			if (from_city_options.get(i).getText().contains("NASHIK ROAD - NK")) {
				from_city_options.get(i).click();
			}
		}

	}

}
