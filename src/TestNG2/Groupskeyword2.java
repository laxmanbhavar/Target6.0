package TestNG2;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groupskeyword2 {
	
	@Test(groups= "open")
	public void TC07() {
		Reporter.log("Test case 07 execute",true);
	}
	@Test(groups= "logout")
	public void TC08() {
		Reporter.log("Test case 08 execute",true);
	}
	@Test(groups= "login")
	public void TC09() {
		Reporter.log("Test case 09 execute",true);
		Assert.fail();
	}
	@Test(groups= "open")
	public void TC010() {
		Reporter.log("Test case 10 execute",true);
	}
	@Test(groups= "close")
	public void TC19() {
		Reporter.log("Test case 19 execute",true);
	}
	@Test(groups= "login")
	public void TC12() {
		Reporter.log("Test case 12 execute",true);
	}

}
