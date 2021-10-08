package com.necttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellHomepagePOM {

	WebDriver driver;
	 public  DellHomepagePOM (WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	 }

	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[1]/a/span")
	 //@FindBy(xpath="//*[@id=\"l1\"]")
	 WebElement click_product;
	 public WebElement product() { 
	  return click_product ;
	  }
	
	 @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[1]/ul/li[3]/a")
	 WebElement Click_laptop;
	 public WebElement laptop() {
		 return Click_laptop;
	 }


}
