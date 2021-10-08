package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.necttech.pageobjectmodel.DellContactUSPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellContactUS {

	WebDriver driver;
	
	@Given("^User visit Dell Home page$")
	public void user_visit_Dell_Home_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chrome\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://www.dell.com/en-us");
	}

	@When("^Click Contact Us$")
	public void click_Contact_Us() throws Throwable {
		DellContactUSPOM dg = new DellContactUSPOM(driver);
		dg.COntactUS().click();
	}

	@Then("^Click Technical Support$")
	public void click_Technical_Support() throws Throwable {
		DellContactUSPOM dg = new DellContactUSPOM(driver);
		dg.TechSupport().click();
	}

	@Then("^click browse all product  and close the window$")
	public void click_browse_all_product_and_close_the_window() throws Throwable {
		DellContactUSPOM dg = new DellContactUSPOM(driver);
		dg.AllProduct().click();
		
		driver.close();
	}


}
