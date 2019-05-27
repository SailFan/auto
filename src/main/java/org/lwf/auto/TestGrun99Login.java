package org.lwf.auto;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestGrun99Login {
	private static Logger logger = Logger.getLogger(TestGrun99Login.class);    
	WebDriver webDriver;
	Guru99Login loginPage;
	Guru99HomePage homePage;

	@BeforeTest
	public void setUpTest(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ikan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		webDriver = new ChromeDriver();
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webDriver.get("http://demo.guru99.com/V4/");
	}
	
	@Test(priority=0)
	public void testHomePageApperCorrect(){
		loginPage = new Guru99Login(webDriver);
		String title = loginPage.getLoginTitle();
		Assert.assertTrue(title.toLowerCase().contains("guru99 bank"));
		loginPage.loginToGun99("mgr123", "mgr!23");
		homePage = new Guru99HomePage(webDriver);
		Assert.assertTrue(homePage.getHomePageUserName().toLowerCase().contains("manger id : mgr123"));
	}
	
	@Test
	public void testLoginGun99(){
		Guru99Login login = new Guru99Login(webDriver);
		login.loginToGun99("mgr123", "mgr!23");
		logger.debug("Current Page Title is"+login.getLoginTitle());
		login.quitBrower();
	}
	
}
