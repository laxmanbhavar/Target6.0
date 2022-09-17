package TestNG1;



import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert {
// In Hard assert first Test case faild then 2nd test case not execute.
	@Test
	public void TC01() {
		String str1 = "ok";    // actual 
		String str2 = " not ok";  // expected
	Assert.assertEquals(str1, str2);
	}
	@Test
	public void TC02() {
		String str3 = "google";
		String str4 = "google";
	Assert.assertEquals(str3, str4);
	}
}
