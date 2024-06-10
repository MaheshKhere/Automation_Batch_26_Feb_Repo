package baseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class BaseClass {
	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");
	public static JavascriptExecutor js;

	// Dynamic Code Launch browser
	public static void launch_browser(String browser) {

		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("disable-notifications");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(options);
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Launched Browser is:- " + browser);
	}

	// Dynamic Code for Navigate url
	public static void navigate_url(String url) {
		driver.get(url);
		System.out.println("Navigated url is:- " + url);
		System.out.println("Title of Web Page is:- " + driver.getTitle());
	}

	// Dynamic Code For ScreenShot
	public static void take_screenshot(String screenshotname) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File target_file = ts.getScreenshotAs(OutputType.FILE);
		File source_file = new File(projectpath + "\\ScreenShot\\" + screenshotname + ".png");
		FileHandler.copy(target_file, source_file);
	}
	
	// dynamic code scroll page
	public static void scroll_page(int ypoints) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+ypoints+")");
	}
	
}
