package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[@id='WelcomeContent']")
	WebElement homePageUserName;
	
	public HomePage(WebDriver Driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//get the username from homepage
		public String getHomePageUserName() {
			return homePageUserName.getText();
		}
}
