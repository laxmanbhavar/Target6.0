package Pop_ups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_popup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\bhava\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
	Set<String> ids = driver.getWindowHandles();//this method return total-
	                                               //windows main page&child page.
		System.out.println(ids.size());
		
	  Iterator<String> itr = ids.iterator(); // read one by one upto condition is true
	  while(itr.hasNext()) {
	String mainpageID= itr.next();
     String childpageID= itr.next();
		    	 
    System.out.println(mainpageID);
   System.out.println(childpageID);
		    	 
	driver.switchTo().window(childpageID);
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
     driver.close();
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		      }
		
	}
	

}
