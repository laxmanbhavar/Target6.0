   package Demo_project_Zerodha;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testclass {
	WebDriver driver; // Globally declear use overall class
	P_module_class login; // globally declear use  call pom class method in Testclass.
	@BeforeClass
	public void Browserlaunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	    login = new P_module_class(driver);
		 driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
	}
   @BeforeMethod
   public void browsermaximise() throws InterruptedException {
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
   }
	 
@Test
	public void TC01() throws InterruptedException, EncryptedDocumentException, IOException{
		login.enteruserid(utility.readexcldata(1, 0));
		Thread.sleep(2000);
		login.clickonlogin();
		String actualtext = login.passworderrormsg();
		String  expectedtext="Password should be minimum 6 characters.";
		Assert.assertEquals(actualtext, expectedtext);
	}
	@Test
 public void TC02() throws InterruptedException, EncryptedDocumentException, IOException {
	login.enterpass(utility.readexcldata(1, 3));
	Thread.sleep(2000);
	login.clickonlogin();
	Thread.sleep(2000);
	String actualtxt = login.useriderrormsg();
	String expectedtxt="User ID should be minimum 6 characters.";
	Assert.assertEquals(actualtxt,expectedtxt);
	
}
	@Test
	public void TC03() throws InterruptedException {
		login.clickonlogin();
		Thread.sleep(2000);
		// username error msg get 
		String actualerror = login.useriderrormsg();
		String expectederror="User ID should be minimum 6 characters.";
		Assert.assertEquals(actualerror, expectederror);
		Thread.sleep(2000);
		// password error msg get
		String actualtext = login.passworderrormsg();
		String  expectedtext="Password should be minimum 8   characters.";
		Assert.assertEquals(actualtext, expectedtext);
		
	}
	
	@AfterMethod
	public void navigaterefresh(ITestResult xyz) throws IOException {
		if(xyz.getStatus()==xyz.FAILURE){
		utility.takesscrenshot(driver);
		}
		driver.navigate().refresh();
	}
	@AfterClass
	public void closebrowser() {
		driver.close();
	}
	
	
	
	
	
}
