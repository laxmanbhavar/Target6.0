package TestNG2;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
// Groups keyword use to groups the test cases as per requirement.
public class Groupskeyword3 {
	@Test(groups= "login")
	public void TC13() {
		Reporter.log("Test case 13 execute",true);
	}
	@Test(groups= "open")
	public void TC14() {
		Reporter.log("Test case 14 execute",true);
	}
	@Test(groups= "close")
	public void TC15() {
		Reporter.log("Test case 15 execute",true);
		Assert.fail();
	}
	@Test(groups= "open")
	public void TC16() {
		Reporter.log("Test case 16 execute",true);
	}
	@Test(groups= "login")
	public void TC17() {
		Reporter.log("Test case 17 execute",true);
	}
	@Test(groups= "close")
	public void TC18() {
		Reporter.log("Test case 18 execute",true);
	}

}
