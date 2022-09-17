package javabysk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class paralleltesting {
	WebDriver driver;
	
	@Test
	public void method1(){
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
	
	}

	@Test
	public void method2(){
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
	
	}

}
