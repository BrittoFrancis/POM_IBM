package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NoPOMtest {
	
	@Test
	public void test_Home_Page_Appear_Correct() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://petstore.octoperf.com/actions/Account.action;jsessionid=819A61F261EE16524B70EC9E54BD443C?signonForm=");
				
			driver.findElement(By.name("username")).sendKeys("j2ee");
			Thread.sleep(3000);
			driver.findElement(By.name("password")).clear();
			Thread.sleep(3000);
			driver.findElement(By.name("password")).sendKeys("j2ee");
			Thread.sleep(3000);
			driver.findElement(By.name("signon")).click();	
			
			String homeText = driver.findElement(By.xpath("//div[@id='WelcomeContent']")).getText();
			System.out.println(homeText);
			
		//Verify login success
			Assert.assertTrue(homeText.contains("ABC"));
			
	}

}

