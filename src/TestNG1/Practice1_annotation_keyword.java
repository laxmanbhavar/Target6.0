package TestNG1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice1_annotation_keyword {
	@Test(priority=3)
	public void Tc01() {
		Reporter.log("TC01 is executed",true); // print in console also report
	}
	@Test(priority=-1)
	public void Tc02() {
		Reporter.log("TC02 is executed",false); // print only console
	}
	@Test(invocationCount=2)
	public void Tc03() {
		Reporter.log("TC03 is executed",true);
	}
	  @BeforeMethod
	  public void login() {
		  System.out.println("Browser login");
	  }
	  @AfterMethod
	  public void logout() {
		  System.out.println("Browser logout");
	  }
	  @BeforeClass
	  public void launch() {
		  System.out.println("Browser launch");
	  }
	  @AfterClass
	  public void close() {
		  System.out.println("Browser close");
	  }
	  
	  

	  
	  

}
