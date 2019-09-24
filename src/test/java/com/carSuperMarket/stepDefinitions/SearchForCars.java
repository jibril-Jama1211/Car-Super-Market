package com.carSuperMarket.stepDefinitions;

import com.carSuperMarket.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class SearchForCars {
	
	HomePage homePage = new HomePage();
	
	@Given("I navigate to carsupermarket home page")
	public void i_navigate_to_carsupermarket_home_page() throws Exception 
	
	{
		
		homePage.navigateToHomePage();
	    
	}

	
	@Given("I click on Searchbar-make")
	public void i_click_on_Searchbar_make() throws Exception 
	
	{
	    homePage.clickOnMakeBar();
	   
	}
	
	@Given("I click on the make of the car as {string}")
	public void i_click_on_the_make_of_the_car_as(String carMake) throws Exception {
	    
		
		homePage.clickOnCarMake(carMake);
	}

	@Given("I select the car model as {string}")
	public void i_select_the_car_model_as(String carModel) throws Exception {
		
		homePage.clickOnCarModel(carModel);
	   
	}

	@Given("I select the trim as {string}")
	public void i_select_the_trim_as(String carTrim) throws Exception {
		
		homePage.clickOnCarTrim(carTrim);
	    
	}

	@Given("I click on SearchVehicles")
	public void i_click_on_SearchVehicles() throws Exception {
		
		homePage.clickOnSearchButton();
	    
	}

	@When("I select the min price as {string}")
	public void i_select_the_min_price_as(String string) {
	    
	}

	@When("I select the max price as {string}")
	public void i_select_the_max_price_as(String string) {
	   
	}

	@When("I select the min monthly payment as {string}")
	public void i_select_the_min_monthly_payment_as(String string) {
	    
	}

	@When("I select the max monthly payment as {string}")
	public void i_select_the_max_monthly_payment_as(String string) {
	    
	}

	@When("I select the car age as {string}")
	public void i_select_the_car_age_as(String string) {
	    
	}

	@When("I select the mileage as {string}")
	public void i_select_the_mileage_as(String string) {
	    
	}

	@When("I select the body type as {string}")
	public void i_select_the_body_type_as(String string) {
	   
	}

	@When("I select the fuel type as {string}")
	public void i_select_the_fuel_type_as(String string) {
	    
	}

	@When("I select the number of doors as {string}")
	public void i_select_the_number_of_doors_as(String string) {
	    
	}

	@When("I select the number of seats as {string}")
	public void i_select_the_number_of_seats_as(String string) {
	    
	}

	@When("I select the car colour as {string}")
	public void i_select_the_car_colour_as(String string) {
	   
	}

	@When("I select the transmissions types as {string}")
	public void i_select_the_transmissions_types_as(String string) {
	   
	}

	@When("I select the car location as {string}")
	public void i_select_the_car_location_as(String string) {
	    
	}

	@When("I select the added since as {string}")
	public void i_select_the_added_since_as(String string) {
	    
	}

	@When("I select the ignore reservvation as {string}")
	public void i_select_the_ignore_reservvation_as(String string) {
	   
	}

	@When("I select the deposit amount as {string}")
	public void i_select_the_deposit_amount_as(String string) {
	    
	}

	@When("I select the annual millage as {string}")
	public void i_select_the_annual_millage_as(String string) {
	    
	}

	@When("I select the finance period as {string}")
	public void i_select_the_finance_period_as(String string) {
	   
	}

	@When("I select the sort result as {string}")
	public void i_select_the_sort_result_as(String string) {
	    
	}

	@Then("The search result for {string} is displayed")
	public void the_search_result_for_is_displayed(String string) {
	   
	}

	@Then("The {string} of the make is also displayed")
	public void the_of_the_make_is_also_displayed(String string) {
	    
	}



}
