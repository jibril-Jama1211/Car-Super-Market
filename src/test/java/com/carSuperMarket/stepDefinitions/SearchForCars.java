package com.carSuperMarket.stepDefinitions;

import com.carSuperMarket.pages.HomePage;
import com.carSuperMarket.pages.ResultSearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class SearchForCars {
	
	HomePage homePage = new HomePage();
	
	ResultSearchPage searchResult = new ResultSearchPage();
	
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
		
		// this will tell selenium to go to next page i.e. searchResult page
	    
		searchResult = homePage.clickOnSearchButton();
	    
	}

	@When("I close can I get credit PopUp")
	public void i_close_can_I_get_credit_PopUp() throws Exception {
	    
		searchResult.CloseCreditPopUP ();
	}
	
	
					/*Payment Search options*/
	
	
	@When("I select the min price as {string}")
	public void i_select_the_min_price_as(String minPrice) throws Exception {
		
		searchResult.selectMinPrice(minPrice);
		
	    
	}

	@When("I select the max price as {string}")
	public void i_select_the_max_price_as(String maxPrice) throws Exception {
		
		searchResult.selectMaxPrice(maxPrice);
	   
	}

	@When("I select the min monthly payment as {string}")
	public void i_select_the_min_monthly_payment_as(String minMontlyPayment) throws Exception {
		
		searchResult.minMonthlyPayment(minMontlyPayment);
	    
	}

	@When("I select the max monthly payment as {string}")
	public void i_select_the_max_monthly_payment_as(String maxMontlyPayment) throws Exception {
		
		searchResult.maxMonthlyPayment(maxMontlyPayment);
	    
	}

	
					/* Car Specification options*/
	
	@When("I select the car age as {string}")
	public void i_select_the_car_age_as(String carAge) throws Exception {
		
		searchResult.Age(carAge);
	    
	}

	@When("I select the mileage as {string}")
	public void i_select_the_mileage_as(String carMileage) throws Exception {
		
		searchResult.Mileage(carMileage);
	    
	}

	@When("I select the body type as {string}")
	public void i_select_the_body_type_as(String bodyType) throws Exception {
		
		searchResult.BodyType(bodyType);
	   
	}

	@When("I select the fuel type as {string}")
	public void i_select_the_fuel_type_as(String fuelType) throws Exception {
		
		searchResult.FuelType(fuelType);
	    
	}

	@When("I select the number of doors as {string}")
	public void i_select_the_number_of_doors_as(String numberOfDoors) throws Exception {
		
		searchResult.numberOfDoors(numberOfDoors);
	    
	}

	@When("I select the number of seats as {string}")
	public void i_select_the_number_of_seats_as(String seats) throws Exception {
		
		searchResult.numberOfSeats(seats);
	    
	}

	@When("I select the car colour as {string}")
	public void i_select_the_car_colour_as(String colour) throws Exception {
	   
		searchResult.Colour(colour);
		
	}

	@When("I select the transmissions types as {string}")
	public void i_select_the_transmissions_types_as(String transmission) throws Exception {
		
		searchResult.Transmissions(transmission);
	   
	}

	@When("I select the car location as {string}")
	public void i_select_the_car_location_as(String location) throws Exception {
		
		searchResult.Location(location);
	    
	}

	@When("I select the added since as {string}")
	public void i_select_the_added_since_as(String since) throws Exception {
		
		searchResult.AddedSince(since);
	    
	}

	@When("I select the ignore reservvation as {string}")
	public void i_select_the_ignore_reservvation_as(String reserved) throws Exception {
		
		searchResult.Reserved(reserved);
	   
	}

					/* Finance Options*/
	

	
	@When("I select the deposit amount as {string}")
	public void i_select_the_deposit_amount_as(String amount) throws Exception {
	
		
		searchResult.depositAmount(amount);
	    
	}

	@When("I select the annual mileage as {string}")
	public void i_select_the_annual_mileage_as(String mileage) throws Exception {
	    
		searchResult.annualMileage(mileage);
		
	}

	@When("I select the finance period as {string}")
	public void i_select_the_finance_period_as(String period) throws Exception {
		
		searchResult.financePeriod(period);
	   
	}

	

					/*Verify Result*/
	
	@Then("The search result for {string} is displayed")
	public void the_search_result_for_is_displayed(String carName) throws Exception {
		
		searchResult.checkResult(carName);
	   
	}




}
