package com.necttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellDealNavPOM {

	WebDriver driver;
	public DellDealNavPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[5]/a/span")
	WebElement hover_deal;
	public WebElement Deals() {
		return hover_deal;
	}
	
	@FindBy(xpath="//a[@href=\"//deals.dell.com/en-us/category/desktops\"]")
	WebElement click_desktop;
	public WebElement Desktop() {
		return click_desktop ;
	}
	
	
}
