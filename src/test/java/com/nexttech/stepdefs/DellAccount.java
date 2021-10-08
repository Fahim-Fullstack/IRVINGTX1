package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.necttech.pageobjectmodel.DellAccountPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAccount {
	
	WebDriver driver;
	
	@Given("^open  url$")
	public void open_url() throws Throwable {
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

	@When("^click Signin button$")
	public void click_Signin_button() throws Throwable {
	   
		try {
		Actions act=new Actions(driver); // 
		DellAccountPOM sg=new DellAccountPOM(driver);
		act.moveToElement(sg.signin()).build().perform();
	 	sg.signin().click();
	 	
	 	Thread.sleep(2000);
		}catch(Exception e)
		{
			System.out.println("show errors");
		}
	}
	
	@Then("^Create an account$")
	public void create_an_account() throws Throwable {
	    try {
		Actions act=new Actions(driver);
	    DellAccountPOM ca=new DellAccountPOM(driver);
	    act.moveToElement(ca.CreateNewAccount()).build().perform();
	    ca.CreateNewAccount().click();
	    
	    Thread.sleep(2000);
	    }catch(Exception e) 
	    {
	    	System.out.println("show errors");
	    }
	}

	@Then("^Send \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\"$")
	public void send(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		try {
		DellAccountPOM na=new DellAccountPOM(driver);
		na.FirstName().sendKeys(arg1);
		na.LastName().sendKeys(arg2);
		na.email().sendKeys(arg3);
		na.pass().sendKeys(arg4);
		Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println("Show errors");
		}
	}

	@Then("^click Create account button$")
	public void click_Create_account_button() throws Throwable {
		try {
		DellAccountPOM na=new DellAccountPOM(driver);
		na.createAccount().click();
		
		driver.close();
		}catch(Exception e) {
			System.out.println("Shows Errors");
		}
	}

}
