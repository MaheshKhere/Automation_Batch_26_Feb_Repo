package launch_Browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class_004 {

	public static void main(String[] args) {

		// launch browser
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// navigate url
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());

		// current url
		System.out.println(driver.getCurrentUrl());

		// System.out.println(driver.getPageSource());

		// driver.findElement(By.linkText("Best Sellers")).click();

		// Pass input in Search Box
		WebElement searchbox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	
		searchbox.sendKeys("abs");
		//System.out.println(searchbox.getText());
		System.out.println("Input value of SearchBox is:- "+searchbox.getAttribute("value"));
		//searchbox.clear();
		
		// capture id attribute
		System.out.println(searchbox.getAttribute("id"));
		
		// Capture link name
		WebElement sell = driver.findElement(By.linkText("Sell"));
		
		System.out.println(sell.getText());
	
		sell.click();
	}

}
