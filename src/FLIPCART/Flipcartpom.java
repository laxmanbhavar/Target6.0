package FLIPCART;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipcartpom {
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input") private WebElement username;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input") private WebElement password;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button") private WebElement loginbtn;

	// Initialization
	Flipcartpom(WebDriver driver){   // use parameterized constructor
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
