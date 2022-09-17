package Autosuggestion_dynamicxpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi note 10 pro");
		Thread.sleep(1000);
		
		 // store list in variable
		List<WebElement> element = driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]//li"));
		System.out.println(element.size());
		
		
		for(int i=0;i<=element.size()-1;i++) {
			String listofelement = element.get(i).getText();
			System.out.println(listofelement);
			
			
			if(listofelement.equals("redmi note 10 pro max price")) {
				element.get(i).click();
				break;
			}
			Thread.sleep(2000);
			
			
		}
		
		driver.close();
		
	}
}
