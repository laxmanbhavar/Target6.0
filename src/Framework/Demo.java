package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo {
	// Declaration
	@FindBy(xpath="//input[@type='text']") private WebElement username;
	@FindBy(xpath="//input[@type='password']") private WebElement password;
	@FindBy(xpath="//button[@name='login']") private WebElement loginbtn;

	// Initialization
	Demo(WebDriver driver){   // use parameterized constructor
		PageFactory.initElements(driver, this);
	}
	
	// Usage or Actions
	 public void enteruserid(String user) {//take non static method with parameterized 
		 username.sendKeys(user);                                 // constructor
	 }
	
	 public void enterpassword(String pass) {
		 password.sendKeys(pass);                               
	 }
	 public void login() {
		 loginbtn.click();;                            
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	




















//https://www.facebook.com/