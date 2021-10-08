package com.nexttech.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


public class TestNGTestrunner {

	@CucumberOptions (
			   features = {"Features"},
			   glue = {"src/test/java/com/nexttech/stepdefs"},
			   tags = {"@home", "@dealNav", "@newAccount", "@findNewProduct","@contactUS"}
			)

			 public class TestRunner extends AbstractTestNGCucumberTests{}
}
