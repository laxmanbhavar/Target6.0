package TestNG1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice_Annotation {
	
	@Test
	public void m1(){
		System.out.println("TestNG sucessfully installed");
	}
@Test
public void m2() {
	System.out.println("TC-01 Pass");
}
@BeforeMethod
public void m3() {
	System.out.println("Application login sucessfully");
}
@AfterMethod
public void m4() {
	System.out.println("Application logout sucessfully");
}
}
