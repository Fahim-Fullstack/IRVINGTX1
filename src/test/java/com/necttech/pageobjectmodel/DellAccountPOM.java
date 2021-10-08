package com.necttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellAccountPOM {

	WebDriver driver;
	public DellAccountPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id=\"um-si-label\"]")
	//steps-1     //declare WebElement
	WebElement click_signin;
	
	//steps- 2   // create a method 
	public WebElement signin () {   
		return click_signin;
	}
	
	@FindBy(xpath="/html[1]/body[1]/main[1]/header[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/a[2]")
	WebElement click_CreateNewAccount;
	public WebElement CreateNewAccount() {
		return click_CreateNewAccount;
	}
	
	
	@FindBy(xpath="//*[@id=\"FirstName\"]")
	WebElement enter_FirstName;
	public WebElement FirstName() {
		return enter_FirstName;
	}
	
	@FindBy(xpath="//*[@id=\"LastName\"]")
	WebElement enter_LastName;
	public WebElement LastName() {
		return enter_LastName ;
	}
	
	@FindBy(xpath="//*[@id=\"CreateAccountEmailAddress\"]")
	WebElement enter_email;
	public WebElement email() {
		return enter_email ;
	}
	
	@FindBy(xpath="//*[@id=\"NewPassword\"]")
	WebElement enter_pass;
	public WebElement pass() {
		return enter_pass ;
	}
	
	@FindBy(xpath="//*[@id=\"create-account-button\"]")
	WebElement click_createAccount;
	public WebElement createAccount() {
		return click_createAccount  ;
	}

}
