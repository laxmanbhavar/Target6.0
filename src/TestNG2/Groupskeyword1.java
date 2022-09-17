package TestNG2;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groupskeyword1 {
	
	@Test(groups= "login")
	public void TC01() {
		Reporter.log("Test case 01 execute",true);
		Assert.fail();
	}
	@Test(groups= "logout")
	public void TC02() {
		Reporter.log("Test case 02 execute",true);
	}
	@Test(groups= "buy")
	public void TC03() {
		Reporter.log("Test case 03 execute",true);
	}
	@Test(groups= "open")
	public void TC04() {
		Reporter.log("Test case 04 execute",true);
	}
	@Test(groups= "close")
	public void TC05() {
		Reporter.log("Test case 05 execute",true);
	}
	@Test(groups= "close")
	public void TC06() {
		Reporter.log("Test case 06 execute",true);
	}

}
