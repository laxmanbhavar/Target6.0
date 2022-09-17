package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFW {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");

		// create object of Demo class
		 Demo d = new Demo(driver);
		 
		 // TC-01
		 // enter username
		 d.enteruserid("Laxman bhavar");
		 // enter password
		 d.enterpassword("Laxman@123");
		 // Login
		 d.login();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		  
		 // Test TC-02
		 d.enteruserid("Bhagvat Bhavar");
		 d.enterpassword("9511614764");
		 d.login();
		 Thread.sleep(3000);
		 driver.close();
		 
		 
		 
	}
		 
}	 
