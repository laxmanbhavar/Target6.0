package Autosuggestion_dynamicxpath;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("realme narzo 20");
		Thread.sleep(1000);
		
		  //store list in variable
		List<WebElement> element = driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
		System.out.println(element.size());
		
		for(int i=0;i<=element.size()-1;i++) {
			String listofmobile= element.get(i).getText();
			System.out.println(listofmobile);
			if(listofmobile.equals("realme narzo 20 back cover")) {
				element.get(i).click();
				break;
			}
			
			
		
		}
		Thread.sleep(2000);
		driver.close();
		
}
}