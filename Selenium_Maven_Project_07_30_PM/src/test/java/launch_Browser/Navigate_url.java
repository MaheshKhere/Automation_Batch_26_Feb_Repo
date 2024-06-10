package launch_Browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_url {
	public static void main(String[] args) {
     WebDriver  driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     // url hit
     driver.get("https://www.amazon.in/");
     driver.findElement(By.id("twotabsearchtextbox"));
     driver.findElement(By.name(""));
     driver.findElement(By.className("nav-input nav-progressive-attribute"));
     driver.findElement(By.linkText("Customer Service"));
     driver.findElement(By.partialLinkText("tomer Service"));
	driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
	}
}
