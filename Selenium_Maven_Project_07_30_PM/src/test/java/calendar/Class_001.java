package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class Class_001 extends BaseClass{
	public static String month_year;

	public static void main(String[] args) {
		launch_browser("chrome");
		navigate_url("https://www.railyatri.in/");
		
		// Click on Calendar
		WebElement date_dropdown = driver.findElement(By.cssSelector("input#datepicker_train"));
		date_dropdown.click();
		
		while(true) {
			// Capture month and year
			 month_year= driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();	
		if(!(month_year.equalsIgnoreCase("June 2024"))) {
			// Click next button
			driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
		}
		else {
			break;
		}}
		
		// Select date
		driver.findElement(By.xpath("//td[text()='20']")).click();

		// Capture Selected Month
		System.out.println("Selected Month is :- "+month_year);
		
		// Capture selected date
		System.out.println("Selected Date is:- "+date_dropdown.getAttribute("value"));
	}}
