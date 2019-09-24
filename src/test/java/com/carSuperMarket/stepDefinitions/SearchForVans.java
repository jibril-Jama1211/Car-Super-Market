package com.carSuperMarket.stepDefinitions;

import com.carSuperMarket.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchForVans {
	
	HomePage homePage = new HomePage();
	
	@Given("I navigate to homePage")
	public void i_navigate_to_homePage() throws Exception {
	    
		homePage.navigateToHomePage();
	}

	@When("I click on Van link")
	public void i_click_on_Van_link() throws Exception {
	    
		homePage.vanLinkClick();
	}

	@Then("search result Vans is displayed")
	public void search_result_Vans_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


}
