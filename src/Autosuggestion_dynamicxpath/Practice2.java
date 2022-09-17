package Autosuggestion_dynamicxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://healthcaresuccess.com/who-we-serve");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[contains(text(),'Who We Serve')]")).click();
	
	 
	 
	}
	

}
