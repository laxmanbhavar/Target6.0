package Drag_and_Drop;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Practice {


	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.globalsqa.com/demo-site/draganddrop//");
		 Thread.sleep(2000);
		 driver.switchTo().frame(2);// iFrame in webpage then use
		 
		 //  find Locater of source element and store it in reference variable
		WebElement source = driver.findElement(By.xpath("//img [@alt=\"The chalet at the Green mountain lake\"]"));
		WebElement source2 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
		 WebElement source3 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[3]/img"));
		  WebElement source4 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[4]/img"));

      //  find Locater of Destination element and store it in reference variable 
		WebElement source1 = driver.findElement(By.xpath("//div [@id=\"trash\"]"));
		 
		 // create object of actions class
		 Actions act = new Actions(driver);
		 
		 // use drag and drop method
		 act.dragAndDrop(source, source1).perform();
		 Thread.sleep(2000);
		 act.dragAndDrop(source2, source1).perform();
		 Thread.sleep(2000);
		 act.dragAndDrop(source3, source1).perform();
		 Thread.sleep(2000);
		 act.dragAndDrop(source4, source1).perform();
		 
       File store = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      File f = new File("D:\\screenshot\\New folder image1.jpg");
      FileHandler.copy(store, f);
		 
	

		
		 
	}

}
