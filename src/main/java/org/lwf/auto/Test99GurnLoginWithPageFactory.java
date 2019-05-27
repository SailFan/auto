package org.lwf.auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test99GurnLoginWithPageFactory {
	
	
	
	
	WebDriver webDriver;
	FactoryGurnLogin factoryGurnLogin;
	
	@BeforeTest
	public void beforeTest(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ikan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		webDriver = new ChromeDriver();
		webDriver.get("http://demo.guru99.com/V4/");
	}
	
	@Test
	public void test1(){
		factoryGurnLogin = new FactoryGurnLogin(webDriver);
		String title = factoryGurnLogin.currentPageTitle();
		System.out.println(title);
		factoryGurnLogin.loginToGuru99("mgr123", "mgr!23");
		String title2 = factoryGurnLogin.currentPageTitle();
		Assert.assertEquals(title, title2);
	}
	
	
}
