package Scrolling;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		
		((JavascriptExecutor)driver).executeScript("scroll(0,250)");
		
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("scroll(0,-250)");
		Thread.sleep(2000);

	
	}

}
