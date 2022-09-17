package Frame_work1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class module_class {
	// Decleration
		@FindBy(xpath="//input[@name='firstname']")private  WebElement username;
		@FindBy(xpath="//input[@name='lastname']")private  WebElement surname;
		@FindBy(xpath="//input[@name='reg_email__']")private  WebElement enteremail;
		@FindBy(xpath="//input[@data-type=\"password\"]")private  WebElement enterpassword;
		@FindBy(xpath="//select[@id='day']")private  WebElement enterday;
		@FindBy(xpath="//select[@id='month']")private  WebElement entermonth;
		@FindBy(xpath="//select[@id='year']")private  WebElement enteryear;
		@FindBy(xpath="//label[text()='Male']")private  WebElement malecheckbox;
		@FindBy(xpath="//button[@name='websubmit']")private  WebElement signup;

		

		
		
		// Initialization
		module_class(WebDriver driver){
			PageFactory.initElements(driver, this);
		}
		
		// Usage or Action
		public void enterusername(String user) {
			username.sendKeys(user);
			
		}
		public void entersurname(String sname) {
			surname.sendKeys(sname);
			
		}
		public void mail(String email) {
			enteremail.sendKeys(email);
			
		}
		public void password(String pass) {
			enterpassword.sendKeys(pass);
		}
		public void day(String Day) {
			Select s = new Select(enterday);
			s.selectByValue(Day);
		}
		public void month(String Month) {
			Select s = new Select(entermonth);
			s.selectByVisibleText(Month);
		}
		public void year(String Year) {
			Select s = new Select(enteryear);
			s.selectByValue(Year);
		}
		public void male() {
			malecheckbox.click();
		}
		public void Click() {
			signup.click();
		}
		
		
		
		
		
		
		
		
		
		
}
