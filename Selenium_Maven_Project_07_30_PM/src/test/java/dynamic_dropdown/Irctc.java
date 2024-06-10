package dynamic_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class Irctc extends BaseClass{

	public static void main(String[] args) {
launch_browser("chrome");
navigate_url("https://www.irctc.co.in/");
		
		//(//ul[@id='pr_id_1_list']/li)[2

WebElement from_city = driver.findElement(By.xpath("//span[@class='ng-tns-c57-8 ui-autocomplete ui-widget']//input"));
from_city.sendKeys("nashik");

 WebElement option = driver.findElement(By.xpath("(//ul[@id='pr_id_1_list']/li)[2]"));

//WebElement option = driver.findElement(By.xpath("(//ul[@id='pr_id_1_list']/li/span)[2]"));
 System.out.println(option.getText());

 option.click();

 //System.out.println(option.getText());

 
 //option.click();
	}

}
