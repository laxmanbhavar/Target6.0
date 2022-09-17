package TestNG1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	
	@Test
	public void TC01() {
		String str1 ="Laxman";
		String str2 = "Laxy";
		String str3 ="True";
		String str4 = "True";
		String str5 ="ok";
		String str6 = "ok";
		SoftAssert soft = new SoftAssert(); // SoftAssert class object create
		soft.assertEquals(str1, str2);
		soft.assertNotEquals(str3, str4);
		soft.assertEquals(str5, str6);
		soft.assertAll(); 
	}
	@Test
	public void TC02() {
		String str7 = "sonaji";
		String str8 = "sona";
		
	}
 

}
