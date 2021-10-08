package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.necttech.pageobjectmodel.DellHomepagePOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellHomePage {

	WebDriver driver;

	@Given("^User visit DellHome page$")
	public void user_visit_DellHome_page() throws Throwable {
		
	try {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver(); 
		   
		//soft wait =implicit wait
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
		
		 //how to maximize the browser
		 driver.manage().window().maximize();
						 
		//how to open url  driver.get method
		 driver.get("https://www.dell.com/");
		 
		}
	catch(Exception e){
			System.out.println("No errors");
		}
	} 

	@When("^Click product$")
	public void click_product() throws Throwable {
	    
		Actions act =new Actions (driver); // New line
		DellHomepagePOM  pg =new DellHomepagePOM(driver);
		act.moveToElement(pg.product()).build().perform(); // New Line
		pg.product().click();
		 
		//heard wait
		 Thread.sleep(2000);
	}

	@Then("^Click laptop$")
	public void click_laptop() throws Throwable {
		Actions act =new Actions (driver); // New line
		DellHomepagePOM  pg =new DellHomepagePOM(driver);
		act.moveToElement(pg.laptop()).build().perform();
		pg.laptop().click();
		//heard wait
		Thread.sleep(2000);
	}

	@Then("^close the windows$")
	public void close_the_windows() throws Throwable {
	    driver.close();
	}

}
