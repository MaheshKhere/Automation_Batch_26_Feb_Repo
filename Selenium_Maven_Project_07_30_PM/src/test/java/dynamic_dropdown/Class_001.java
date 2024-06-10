package dynamic_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class Class_001 extends BaseClass {

	public static void main(String[] args) {

		launch_browser("chrome");
		navigate_url("https://www.railyatri.in/");
		scroll_page(150);

		// locate From City and Send city name
		WebElement from_city = driver.findElement(By.xpath("//input[@id='from_stn_input']"));
		from_city.sendKeys("Mumbai");

		// locate from city options
		List<WebElement> from_city_options = driver.findElements(By.xpath("//ul[@id='ui-id-5']/li"));

		// choose one option
		for (int i = 0; i < from_city_options.size(); i++) {
			if (from_city_options.get(i).getText().contains("MUMBAI CSMT | CSMT")) {
				from_city_options.get(i).click();
			}}

		// Captured From City Name  
		System.out.println("Entered From City is:- " + from_city.getAttribute("value"));

		// locate to City dropdown and Pass City name
		WebElement to_city = driver.findElement(By.xpath("//input[@id='to_stn_input']"));
		to_city.sendKeys("bangalore");

		// locate To City options
		List<WebElement> to_city_options = driver.findElements(By.xpath("//ul[@id='ui-id-6']/li"));

		// Choose one option
		for (int x = 0; x < to_city_options.size(); x++) {
			if (to_city_options.get(x).getText().contains("BANGALORE CANT | BNC")) {
				to_city_options.get(x).click();
			}
		}

		// Captured To City Name
		System.out.println("Entered to city is:- " + to_city.getAttribute("value"));
	}

}
