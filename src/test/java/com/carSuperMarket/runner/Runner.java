package com.carSuperMarket.runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = {"classpath:com/carSuperMarket/features"},
		
		plugin = {"pretty", "html:target/cucumber-html-report"},
		
		glue = {"com/carSuperMarket/hook", "com/carSuperMarket/stepDefinitions"},
		
		dryRun = false,
		
		monochrome = false
		
		)

public class Runner {
	
	
	









}
