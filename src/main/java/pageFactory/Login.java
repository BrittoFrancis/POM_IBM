package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	
	//All the Webelement will be identified by @FindBy Annotation
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//p[contains(text(),'Please enter')]")
	WebElement messageText;
	
	@FindBy(name="signon")
	WebElement login;
	
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);//This will create all the web elements
	}
	
	//set username in textbox
		public void setUserName(String strUserName) {
			username.sendKeys(strUserName);
		}
		
		//set password
		public void setPassword(String strPassword) {
			password.clear();
			password.sendKeys(strPassword);
		}
		//click on the login button
		public void clickLogin() {
			login.click();
		}
		//get the message
		public String getLoginMessage() {
			
			return messageText.getText();
			
		}
		
		//This method will be exposed in test cases to login to Application
		
		public void loginToApplication(String strUserName, String strPassword) {
			//Fill the username
			this.setUserName(strUserName);
			//Fill the Password
			this.setPassword(strPassword);
			//click login
			this.clickLogin();
		
	
	
		}
	
	

}
