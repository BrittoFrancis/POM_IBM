package tests;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Login;
import pages.HomePage;

public class TestLoginusingPOM {
	
	WebDriver driver;
	Login objLogin;
	HomePage objHomePage;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://petstore.octoperf.com/actions/Account.action;jsessionid=819A61F261EE16524B70EC9E54BD443C?signonForm=");
			
	}
	
	@Test
	public void test_Home_Page_Appear_Correct() {
		objLogin = new Login(driver);
		//verify the message on the login page
		String loginPageMessage = objLogin.getLoginMessage();
		Assert.assertTrue(loginPageMessage.contains("Please enter"));
		//To login
		objLogin.loginToApplication("j2ee","j2ee");
		//Goto next page
		objHomePage = new HomePage(driver);
		//verify the homepage
		Assert.assertTrue(objHomePage.getHomePageUserName().contains("ABC"));
		
		
	}
	

}
