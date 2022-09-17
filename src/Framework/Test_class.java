package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_class {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/signup");
		 
    // Create object of Practice class 
		 Practice p = new Practice(driver);
		 
		 // TC-01 Enter username
		 p.enterusername("Laxman");
		// Thread.sleep(2000);
		 p.entersurname("Bhavar");
		// Thread.sleep(2000);
		 p.entermobileno("8668895353");
		// Thread.sleep(2000);
		 p.enterpassword("Laxman@123");
		 Thread.sleep(2000);

		 
		 
		 
		 
		 
		 
		 
		 
	}
}
