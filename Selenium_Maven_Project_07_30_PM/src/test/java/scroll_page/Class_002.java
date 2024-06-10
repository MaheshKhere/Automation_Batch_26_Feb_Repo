package scroll_page;

import org.openqa.selenium.JavascriptExecutor;

import baseClass.BaseClass;

public class Class_002 extends BaseClass {

	public static void main(String[] args) throws Exception {

		launch_browser("chrome");
		navigate_url("https://www.railyatri.in/");
		take_screenshot("railyatri_homepage");

		// scroll upto bottom
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		take_screenshot("after Scroll page at Bottom");

		// click back arrow
		js.executeScript("window.history.back()");
		
	}

}
