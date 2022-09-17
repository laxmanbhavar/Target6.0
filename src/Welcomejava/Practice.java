package Welcomejava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhava\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.close();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("7767097600");
	Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Laxman@12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
			driver.navigate().to("https://www.instagram.com/");
		
		
	}

}
