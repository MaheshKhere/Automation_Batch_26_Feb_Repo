package different_Verifications;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class Class_001 extends BaseClass{

	public static void main(String[] args) {
		
		launch_browser("chrome");
		navigate_url("https://www.flipkart.com/");
		
		String link_name_1 = driver.findElement(By.xpath("//span[text()='Grocery']")).getText();

		System.out.println("Link Name_1 is :- "+link_name_1);
		
		String link_name_2= driver.findElement(By.xpath("//span[text()='Grocery']")).getAttribute("innerHTML");
	
		System.out.println("Link Name_2 is :- "+link_name_2);
	
	}
}
