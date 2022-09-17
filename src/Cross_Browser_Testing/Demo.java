package Cross_Browser_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", 
				"C:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in/?tag=admpdesktopin-21");
		driver.close();
		
		
	}

}
