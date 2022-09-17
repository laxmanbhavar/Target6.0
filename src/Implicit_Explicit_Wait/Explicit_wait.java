package Implicit_Explicit_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			//find locator and store in element
			WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
			
			//Create Object of WebDriverWait Class
			WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
			//give Condition
			w.until(ExpectedConditions.visibilityOf(username));
			username.sendKeys("Laxman Bhavar");
			
	}
}
