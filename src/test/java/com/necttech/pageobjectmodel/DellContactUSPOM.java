package com.necttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellContactUSPOM {

	WebDriver driver;
	public DellContactUSPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"mh-unified-footer\"]/nav[1]/div[1]/div[3]/ul/li[2]/a")
	WebElement click_ContactUS;
	public WebElement COntactUS() {
		return click_ContactUS;
	}
	
	
	@FindBy(xpath="//a[@href=\"/support/contents/en-us/category/contact-information/technical-support\"]")
	WebElement click_TechSupport;
	public WebElement TechSupport() {
		return click_TechSupport ;
	}
	
	
	@FindBy(xpath="//button[@id=\"browseallprod\"]")
	WebElement click_AllProduct;
	public WebElement AllProduct() {
		return click_AllProduct  ;
	}
	
	
	
}
