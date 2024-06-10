package scroll_page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import baseClass.BaseClass;

public class Class_001 extends BaseClass {

	public static void main(String[] args) throws Exception {
		launch_browser("firefox");
		navigate_url(
				"https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gad_source=1&gclid=Cj0KCQiA3uGqBhDdARIsAFeJ5r3RO2qNWn6_s_r7NbIB2IEkDpyX7kEBaI1EXWc7JIH6RBfQ7glo6rEaAoU-EALw_wcB");
		take_screenshot("homepage_Jeevansathi");

		// Scroll page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");

		// take screen shot
		take_screenshot("After Page Scroll");

		// click facebook icon
		driver.findElement(By.xpath("(//div[@class='social']//a)[1]")).click();

		
		// takescreenshot after click on facebook
		take_screenshot("After click on facebook link");

	}

}
