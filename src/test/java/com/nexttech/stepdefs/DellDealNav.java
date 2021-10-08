package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.necttech.pageobjectmodel.DellDealNavPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellDealNav {

	WebDriver driver;
	@Given("^User go to the Dell Home page$")
	public void user_go_to_the_Dell_Home_page() throws Throwable {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver(); 
			   
			//soft wait =implicit wait
			 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	

			 
			 //how to maximize the browser
			 driver.manage().window().maximize();
							 
			//how to open url  driver.get method
			 driver.get("https://www.dell.com/");
			 
			}catch(Exception e){
				System.out.println("Error Found");
			}

	}

	@When("^Click on deals$")
	public void click_on_deals() throws Throwable {
		DellDealNavPOM ng=new DellDealNavPOM(driver);
		ng.Deals().click();
	}

	@Then("^Click on Desktop Deals and close the windows$")
	public void click_on_Desktop_Deals_and_close_the_windows() throws Throwable {
		DellDealNavPOM ng=new DellDealNavPOM(driver);
		ng.Desktop().click();
	}


}
