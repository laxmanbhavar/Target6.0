package FLIPCART;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LOGINANDBUY {
	 WebDriver driver;
	@BeforeClass
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 //Flipcartpom log=new  Flipcartpom(driver);

		
	}

	@AfterMethod
	public void max() {
		driver.manage().window().maximize();
	}
	@Test
	public void login() {
		 Flipcartpom log=new  Flipcartpom(driver);	
		
		log.enteruserid("9552961664");
		log.enterpassword("Sonaji@123");
		log.login();
		
	}
	
}
