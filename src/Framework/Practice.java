package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Practice {
	// Decleration
	@FindBy(xpath="//input[@name='firstname']")private  WebElement username;
	@FindBy(xpath="//input[@name='lastname']")private  WebElement surname;
	@FindBy(xpath="//input[@name=\"reg_email__\"]")private  WebElement mobileno;
	@FindBy(xpath="//input[@type=\"password\"]")private  WebElement password;
	
	// Initialization
	Practice(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	// Usage or Action
	public void enterusername(String user) {
		username.sendKeys(user);
		
	}
	public void entersurname(String sname) {
		surname.sendKeys(sname);
		
	}
	public void entermobileno(String mno) {
		mobileno.sendKeys(mno);
		
	}
	public void enterpassword(String pass) {
		 password.sendKeys(pass);
		
	}
}
