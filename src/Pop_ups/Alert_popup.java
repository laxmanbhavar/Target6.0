package Pop_ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhava\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demoqa.com/alerts");
		 driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		 
		Alert alrt = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alrt.getText());
		alrt.accept();
	   // alrt.dismiss();
		
		
	}

}

