package TestNG1;                                                 

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice2_Annotations_keywords {
 
//TestNG Annotation    // TestNG Keyword
 //1)@BeforeClass         //1) priority
 //2)@BeforeMethod        //2)invocationCount
 //3)@Test                //3)enabled=false
 //4)@AfterMethod         //4)timeout
 //5)@AfterClass          //5)dependsonMethod
	          
@BeforeClass
public void  launch() {
	Reporter.log("browser launch",true);
}
@BeforeMethod
public void  login() {
	Reporter.log("browser login",true);
}
 @Test(invocationCount=3)
 public void Tcs01() {
 	Reporter.log("Tcs01 Executed",true);
 }
 @Test(priority=-6)
 public void Tcs02() {
 	Reporter.log("Tcs02 Executed",true);
 }
 @Test(priority=-5)
 public void Tcs03() {
 	Reporter.log("Tcs03 Executed",true);
 }
 @Test(enabled=false,priority=-4)
 public void Tcs04() {
 	Reporter.log("Tcs04 Executed",true);
 }
 @Test(priority=-3)
 public void Tcs05() {
 	Reporter.log("Tcs05 Executed",true);
 }
 @Test(priority=-2)
 public void Tcs06() {
 	Reporter.log("Tcs06 Executed",true);
 }
 @Test(priority=-1)
 public void Tcs07() {
 	Reporter.log("Tcs07 Executed",true);
 }
 @AfterMethod(dependsOnMethods="login")
 public void  logout() {
 	Reporter.log("browser logout",true);
 }
 @AfterClass
 public void Close() {
 	Reporter.log("browser close",true);
 }
	
	
	
	
	
}
