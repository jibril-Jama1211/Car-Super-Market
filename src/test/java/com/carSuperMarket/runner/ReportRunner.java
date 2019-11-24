package com.carSuperMarket.runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = {"classpath:com/carSuperMarket/features"},
		
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/cucumber-reports/report.html"},
		
		glue = {"com/carSuperMarket/hook", "com/carSuperMarket/stepDefinitions"},
		
		dryRun = false,
		
		monochrome = false
		
		)




public class ReportRunner {


	@BeforeClass
	public static void setUp() 
	{
		
		
		Reporter.loadXMLConfig(new File("com/carSuperMarket/util/extent-config.xml"));
		
		
		
	}



}
