package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
WebDriver driver;
	
	private By user =  By.name("username");
	private By password =  By.name("password");
	private By message = By.xpath("//p[contains(text(),'Please enter')]");
	private By login = By.name("signon");
	
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	
	//set username in textbox
	public void setUserName(String strUserName) {
		driver.findElement(user).sendKeys(strUserName);
	}
	
	//set password
	public void setPassword(String strPassword) {
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(strPassword);
	}
	//click on the login button
	public void clickLogin() {
		driver.findElement(login).click();
	}
	//get the message
	public String getLoginMessage() {
		
		return driver.findElement(message).getText();
		
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


