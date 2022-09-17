package TestNG2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo3 {
	@Test
	public void TC09(){
		System.out.println("TC-09 Pass");
	}
@Test
public void TC10() {
	System.out.println("TC-10 Pass");
	Assert.fail();
}
@Test
public void TC11(){
	System.out.println("TC-11Pass");
}
@Test
public void TC12() {
System.out.println("TC-12 Pass");
Assert.fail();
}


}
