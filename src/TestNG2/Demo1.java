package TestNG2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void TC01(){
		System.out.println("TC-01 Pass");
	}
@Test
public void TC02() {
	System.out.println("TC-02 Pass");
	Assert.fail();
}
@Test
public void TC03(){
	System.out.println("TC-04 Pass");
}
@Test
public void TC04() {
System.out.println("TC-04 Pass");
Assert.fail();
}

}
