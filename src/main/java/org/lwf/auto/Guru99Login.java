package org.lwf.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99Login {
	WebDriver webDriver;
	By gurn99UserNmae = By.name("uid");
	By gurn99Password = By.name("password");
	By gurn99Titletext = By.className("barone");
	By login = By.name("btnLogin");
	
	
//	初始化浏览器
	public Guru99Login(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	
//	设置UserName
	public void setUserName(String strUserName){
		System.out.println("find userName method invoke");
		webDriver.findElement(gurn99UserNmae).sendKeys(strUserName);
	}
	
//	设置密码
	public void setPassword(String strPassword){
		webDriver.findElement(gurn99Password).sendKeys(strPassword);
	}
	
//	点击登录按键
	public void clickLogin(){
		webDriver.findElement(login).click();
	}
	
	
//	获取title
	public String getLoginTitle(){
//		return webDriver.findElement(gurn99Titletext).getText();
		return webDriver.getTitle();
	} 
	
	
	
//	登录
	public void loginToGun99(String username, String password){
		this.setUserName(username);
		this.setPassword(password);
		this.clickLogin();
	}
	
	void quitBrower(){
		webDriver.quit();
	}
}
