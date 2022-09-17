package TestNG2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
	public void TC05(){
		System.out.println("TC-05 Pass");
	}
@Test
public void TC06() {
	System.out.println("TC-06 Pass");
	Assert.fail();
}
@Test
public void TC07(){
	System.out.println("TC-07 Pass");
}
@Test
public void TC08() {
System.out.println("TC-08 Pass");
}


}
