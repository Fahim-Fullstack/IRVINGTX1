package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.necttech.pageobjectmodel.DellSearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellSearch {

	WebDriver driver;
	
	@Given("^user click on home page$")
	public void user_click_on_home_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chrome\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.dell.com/en-us");
	}
	@When("^send \"([^\"]*)\" on searchbar$")
	public void send_on_searchbar(String arg1) throws Throwable {
		DellSearchPOM sr =new DellSearchPOM(driver);
		sr.search().sendKeys(arg1);
	}

	@Then("^click the search bar$")
	public void click_the_search_bar() throws Throwable {
		DellSearchPOM sr =new DellSearchPOM(driver);
		sr.ClickSearchBar().click();
	}

	@Then("^select one product and click Customized & buy$")
	public void select_one_product_and_click_Customized_buy() throws Throwable {
		DellSearchPOM sr =new DellSearchPOM(driver);
		sr.ClickProduct().click();
		
	}

	@Then("^select one Inspiron Approved for Personal Laptops\\( Add one recommended product to the cart\\)$")
	public void select_one_Inspiron_Approved_for_Personal_Laptops_Add_one_recommended_product_to_the_cart() throws Throwable {
		DellSearchPOM sr =new DellSearchPOM(driver);
		sr.AddRecommendationProduct().click();
	}


	
	@Then("^click get the deal button$")
	public void click_get_the_deal_button() throws Throwable {
		DellSearchPOM sr =new DellSearchPOM(driver);
		sr.GetTheDeal().click();
	}

	@Then("^click proceed to cart button$")
	public void click_proceed_to_cart_button() throws Throwable {
		DellSearchPOM sr =new DellSearchPOM(driver);
		sr.ProceedToCart().click();
	}
	
	@Then("^Change qty (\\d+) to (\\d+) qty$")
	public void change_qty_to_qty(int arg1, int arg2) throws Throwable {
		DellSearchPOM sr =new DellSearchPOM(driver);
		Select change1 =new Select (sr.AddToCart());
		change1.selectByIndex(2);
	}

	@Then("^click checkout button and close$")
	public void click_checkout_button_and_close() throws Throwable {
		DellSearchPOM sr =new DellSearchPOM(driver);
		sr.CheckOut().click();
		
		driver.close();
	}


}
