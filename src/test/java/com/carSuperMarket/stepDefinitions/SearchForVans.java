package com.carSuperMarket.stepDefinitions;

import com.carSuperMarket.pages.HomePage;
import com.carSuperMarket.pages.ResultSearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchForVans  {

	HomePage homePage = new HomePage();
	
	ResultSearchPage searchResult = new ResultSearchPage();
	
	/*
	 * Scenario Outline: Search for different vans on Home Page using Van link 
	 * */
	
	@Given("I click on Vans link")
	public void i_click_on_Vans_link() throws Exception {
	    
		searchResult = homePage.vanLinkClick();
	}

	@When("I select the make of the van as {string}")
	public void i_select_the_make_of_the_van_as(String make) throws Exception {
		
		searchResult.vanMake(make);
		
	}

	@When("I select the van model as {string}")
	public void i_select_the_van_model_as(String model) throws Exception {
		
		
		searchResult.vanModel(model);
	    
	}
	
	@When("I select the Van trim as {string}")
	public void i_select_the_Van_trim_as(String trim) throws Exception {
		
		searchResult.vanTrim(trim);
	    
	}
	
	@When("I select van deposit amount as {string}")
	public void i_select_van_deposit_amount_as(String amount) throws Exception {
	    
		searchResult.depositAmount(amount);
	}

	@When("I select van annual mileage as {string}")
	public void i_select_van_annual_mileage_as(String mileage) throws Exception {
	    
		searchResult.annualMileage(mileage);
	}

	@When("I select van finance period as {string}")
	public void i_select_van_finance_period_as(String period) throws Exception {
	    
		searchResult.financePeriod(period);
	}
	
	@Then("The van search result for {string} is displayed")
	public void the_van_search_result_for_is_displayed(String vanName) throws Exception {
	    
		searchResult.checkResult(vanName);
	}

	/*
	 * Scenario Outline: Search for different vans that are two years old on vans search page 
	 * */

	@When("I select the van age as {string}")
	public void i_select_the_van_age_as(String vanAge) throws Exception {
	    
		searchResult.CloseCreditPopUP ();
		searchResult.Age(vanAge);
	}

	@Then("The vans search result {string} is displayed")
	public void the_vans_search_result_is_displayed(String vanAge) throws Exception {
	    
		
		searchResult.checkVanAge(vanAge);
	}










}
