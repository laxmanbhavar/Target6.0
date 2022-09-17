package Demo_project_Zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class P_module_class {
	//Decleration
	@FindBy(xpath="//input[@id='userid']")private WebElement userid;
	@FindBy(xpath="//button[@type='submit']")private WebElement login;
	@FindBy(xpath="//span[contains(text(),'Password') ]")private WebElement passworderrorMSG;
	@FindBy(xpath="//span[contains(text(),'User')]")private WebElement usererrormsg;
	@FindBy(xpath="//input[@type='password']")private WebElement enterpassword;


	
// Initialization
	P_module_class(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	// Action
	public void enteruserid(String useride) {
		userid.sendKeys(useride);
	}
	
    public void clickonlogin() {
			login.click();
		}
		
	public String passworderrormsg() {
		String msg = passworderrorMSG.getText();
				return msg;
		
	}
	public void enterpass(String Password) {
		enterpassword.sendKeys(Password);
	}
	public String useriderrormsg() {
		String ms = usererrormsg.getText();
		return ms;
	}
	
	
	
	
}












