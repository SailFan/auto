package org.lwf.auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FactoryGurnLogin {

	/**
	 * Page Factory 是selenium WebDriver的内置页面对象模型概念，但他已经经过优化 页面对象存储库和对象方法分离，
	 * 在PageFactory类的帮助下，我们使用@FindBy注释来查找WebElment,
	 * 我们使用initElement方式初始化web元素 @FindBy可以接受tagName，partialLinkText，name，
	 * linkText，id，css，className，xpath作为属性。
	 */

	WebDriver driver;
	@FindBy(name = "uid")
	WebElement grun99userName;

	@FindBy(name = "password")
	WebElement grun99passWord;

	@FindBy(name="btnLogin")
	WebElement grun99login;

	public FactoryGurnLogin(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String userNmae) {
		grun99userName.sendKeys(userNmae);
	}

	public void setPassWord(String passWord) {
		grun99passWord.sendKeys(passWord);
	}
	
	public void clickLogin(){
		this.grun99login.click();
	}
	
	public String currentPageTitle(){
		return driver.getTitle();
	}
	
	public void closeBrower(){
		driver.close();
	}
	
	public void loginToGuru99(String userName, String passWord){
		this.setUserName(userName);
		this.setPassWord(passWord);
		this.clickLogin();
	}
	
}