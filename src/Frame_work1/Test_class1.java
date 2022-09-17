package Frame_work1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_class1 {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/signup");
		 
    // Create object of module_class class 
		 module_class m = new  module_class(driver);
		
		 
		 // TC-01 Enter username
		 m.enterusername(Utility.readexcel(1, 0));
		 Thread.sleep(1000);
		 m.entersurname(Utility.readexcel(1, 1)); 
		Thread.sleep(1000);
		 m.mail(Utility.readexcel(1, 2));
		 Thread.sleep(1000);
		 m.password(Utility.readexcel(1, 3));
		 Thread.sleep(1000);
		m.day("3");
	   m.month("Feb");
	   m.year("1997");
	   m.male();
	   m.Click();
	   // driver.navigate().refresh();
	   // Thread.sleep(2000);
	    
	    //TC-02 Enter Data
	  //  m.enterusername(Utility.readexcel(2, 0));
	  //  m.entersurname(Utility.readexcel(2, 1));
	 //   m.mail(Utility.readexcel(2, 2));
	 //   m.password(Utility.readexcel(2, 3));
	    
	    
}
}
