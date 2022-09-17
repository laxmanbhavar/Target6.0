package Cross_Browser_testing1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Practice {
	@Test
@Parameters("browser")
	public void m1(String browser) throws InterruptedException {
		if(browser.equalsIgnoreCase("firefox")) {
			
			
		
			System.setProperty("webdriver.gecko.driver", 
					"C:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			Thread.sleep(2000);
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/signup");
			Thread.sleep(2000);
		
		}
		else {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			
		}
		
	
	}

}
