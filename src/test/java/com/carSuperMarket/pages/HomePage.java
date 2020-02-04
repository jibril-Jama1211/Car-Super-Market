package com.carSuperMarket.pages;

import java.util.List;

import org.openqa.selenium.WebElement;


import com.carSuperMarket.helper.Base;

public class HomePage extends Base {
	
	WebElement allMakes;
	List<WebElement> makeBar;
	WebElement allModel;
	WebElement allTrims;
	WebElement searchVechileButton;
	WebElement vanLink;
	List<WebElement> allCarMakes;
	List<WebElement> allCarModel;
	List<WebElement> modelBar;
	List<WebElement> allCarModels;
	List<WebElement> trimBar;
	List<WebElement> allCarTrims;
	WebElement searchVechile;
	List<WebElement> readMoreLink;
	
	/*
	 * Scenario Outline: Search for different cars on Home page
	 * */
	
	// implements  step 1 in step definitions
	
	public void navigateToHomePage() throws Exception 
	
	{
		launchUrl("https://www.carsupermarket.com/");
		
	
	}
	
	// implements  step 2 in step definitions
	
	public void clickOnMakeBar() throws Exception
	{
		
		
		makeBar = getElementsByCssSelector("div#searchbar-Make.np-select.right");
		
		Thread.sleep(4000);
		
		
		//HoverOver(makeBar.get(1));
		
		makeBar.get(1).click();
		//javaScriptClick(makeBar.get(1));
	   
	   
	}
	
	// implements  step 3 in step definitions
	
	
	public void clickOnCarMake (String carMake) throws Exception
	{
		
		
		
		allCarMakes = getElementsByXPath("//ul[contains(@class,'np-inner-list')]//li");
		
		
		//System.out.println("The size of the list is: "+ allCarMakes.size());
		
		//int index = Integer.parseInt(carMake);
		
		//select by index
		
		//allCarMakes.get(index).click();
		
		//click on BMW make
		
		// select by value
				for(WebElement modelOption:allCarMakes) 
					
				{
					
						//System.out.println("The car make is: " + modelOption.getText());
						
					    if (modelOption.getText().contains(carMake)) {
					    	
					   modelOption.click();
					   break;
						
						
					}
				}
		
		
   }
		
	// implements step 4 in step definitions
	
	public void clickOnCarModel (String carModel) throws Exception 
	
	{
		
		// open the car model drop down
		
		Thread.sleep(4000);
		
		modelBar = getElementsByCssSelector("div#searchbar-Model.np-select.right");
		
		
		Thread.sleep(2000);
		
	
		 HoverOver(modelBar.get(1));
		
		 modelBar.get(1).click();
		 
		 
		// get the list of car models
		
		allCarModels = getElementsByXPath("//ul[contains(@class,'np-inner-list')]//li");
		
		//System.out.println("The model size is : "+ allCarModels.size());
		
		
		// select by value
		for(WebElement modelOption:allCarModels) 
			
		{
			
				//System.out.println("The car make is: " + modelOption.getText());
				
			    if (modelOption.getText().contains(carModel)) {
			    	
			   modelOption.click();
			   break;
				
				
			}
		}
		
	}	
	
	// implements step 5 in step definitions
	
	public void clickOnCarTrim (String carTrim) throws Exception {
		
		// open the car trim drop down
		
				Thread.sleep(6000);
				
				trimBar = getElementsByCssSelector("div#searchbar-Trim.np-select.right");
				
				
				Thread.sleep(2000);
				
				
				HoverOver(trimBar.get(1));
				
				trimBar.get(1).click();
				
				// get the list of car models
				
				allCarTrims = getElementsByXPath("//ul[contains(@class,'np-inner-list')]//li");
				
				//System.out.println("The Trim size is : "+ allCarTrims.size());
				
				
				// select by value
				
				for(WebElement trimOption:allCarTrims) 
					
				{
					
						//System.out.println("The car make is: " + trimOption.getText());
						
					    if (trimOption.getText().contains(carTrim)) {
					    	
					   trimOption.click();
					   break;
						
						
					}
				}
		
		
	}
	
	
	// implements step 6 in step definitions
	
	public ResultSearchPage clickOnSearchButton() throws Exception {
		
		// get element
		
		searchVechile = getElementByCssSelector("#banner-container > div > div > a");
		
		searchVechile.click();
		
		return new ResultSearchPage();
	}
	
	
	/*
	 * Scenario Outline: Search for different vans on Home Page using Van link 
	 * */
	
	// step one is to navigate to car super market home page

	// its done above and is one time process
	
	// implement step two click on van link
	
 	public ResultSearchPage vanLinkClick () throws Exception
	
	{
		vanLink = getElementByCssSelector("#main-menu-vans");
		
		vanLink.click();
		return new ResultSearchPage();
		
		
	}

 	
 	

	

}
