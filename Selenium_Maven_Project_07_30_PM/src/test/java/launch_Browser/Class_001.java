package launch_Browser;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class_001 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	// Explicit wait- WebDriver Wait
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
		//wait.until(ExpectedConditions.invisibilityOfElementLocated());
	
	//Fluent Wait
	Wait wait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5))
			.ignoring(NoSuchElementException.class);
	
	}

}
