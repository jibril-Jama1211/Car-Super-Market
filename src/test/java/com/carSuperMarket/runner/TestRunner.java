package com.carSuperMarket.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = {"classpath:com/carSuperMarket/features"},
		
		plugin = {"pretty", "json:target/report.json",
        "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"},
		
		glue = {"com/carSuperMarket/hook", "com/carSuperMarket/stepDefinitions"},
		
		dryRun = false,
		
		monochrome = false
		
)





public class TestRunner {
		
	
	

   

}
