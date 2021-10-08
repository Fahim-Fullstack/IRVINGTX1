package com.necttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellSearchPOM {

	WebDriver driver;
	
	public DellSearchPOM (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath="/html[1]/body[1]/main[1]/header[1]/div[1]/div[1]/div[2]/input[1]")
	 WebElement send_search;
	 public WebElement search() {
		 return send_search;
	 }

	 @FindBy(xpath="/html[1]/body[1]/main[1]/header[1]/div[1]/div[1]/div[2]/button[2]/*[name()='svg'][1]")
	 WebElement click_search;
	 public WebElement ClickSearchBar() {
		 return click_search ;
	 }
	 
	 @FindBy(xpath="//*[@id=\"aqar\"]/section[3]/div[2]/div/a")
	 WebElement click_product;
	 public WebElement ClickProduct() {
		 return click_product;
	 }
	 
	@FindBy(xpath="//*[@id=\"570-ABGK\"]")
	WebElement click_mouse;
	public WebElement AddRecommendationProduct() {
		return click_mouse;
	}

	@FindBy(xpath="//*[@id=\"affix-right-rail\"]/button")
	WebElement click_GetTheDeal;
	public WebElement GetTheDeal() {
		return click_GetTheDeal;
	}

	@FindBy(xpath="//*[@id=\"candyAisleModal\"]/div/div/div[2]/div/div[2]/div[2]/a")
	WebElement click_proceedToCart;
	public WebElement ProceedToCart() {
		return click_proceedToCart;
	}
	
	@FindBy(xpath="//*[@id=\"cartContentsPage\"]/div[5]/section/div/div/div/div[2]/section/div[2]/div[1]/div[2]/div/div/div[1]/div[4]/div[1]/div[3]/div[2]/div[1]/div/item-quantity/div/select")
	WebElement select_AddToCart;
	public WebElement AddToCart() {
		return select_AddToCart ;
	}
	
	
	@FindBy( xpath="//*[@id=\"cart-summary-right\"]/div/div/div[1]/div[4]/div[2]/div[1]/button")
	WebElement click_CheckOut;
	public WebElement CheckOut() {
		return click_CheckOut;
	}


}


