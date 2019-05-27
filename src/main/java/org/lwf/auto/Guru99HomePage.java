package org.lwf.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99HomePage {
	WebDriver webDriver;
	
	By homePageUserName = By.xpath("//table//tr[@class='heading3']");
	
	
	public Guru99HomePage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
	
	public String getHomePageUserName(){
		return webDriver.findElement(homePageUserName).getText();
	}
	
}
