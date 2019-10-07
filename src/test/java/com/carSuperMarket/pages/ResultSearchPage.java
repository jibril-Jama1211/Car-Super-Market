package com.carSuperMarket.pages;

import java.util.List;


import org.openqa.selenium.WebElement;

import com.carSuperMarket.helper.Base;




public class ResultSearchPage extends Base {
	
	WebElement minPriceMenu;
	List<WebElement> allMinPrice;
	WebElement maxPriceMenu;
	List<WebElement> allMaxPrice;
	WebElement closePopUp;
	WebElement minMonthlyMenu;
	List<WebElement> allMinMontly;
	WebElement maxMonthlyMenu;
	List<WebElement> allMaxMontly;
	WebElement carAgeMenu;
	List<WebElement> allCarAge; 
	WebElement carMileageMenu;
	List<WebElement> allCarMileage;
	WebElement carBodyTypeMenu;
	List<WebElement> allcarBodyType;
	WebElement carFuelTypeMenu;
	List<WebElement> allcarFuelType;
	WebElement numberOfDoorsMenu ;
	List<WebElement> allnumberOfDoors;
	WebElement numberOfSeatsMenu;
	List<WebElement> allnumberOfSeats;
	WebElement carcolourMenu;
	List<WebElement> allcarcolour;
	WebElement carTransmissionsMenu;
	List<WebElement> allcarTransmissionsMenu;
	WebElement carLocationMenu;
	List<WebElement> allcarLocationMenu;
	WebElement carAddedSinceMenu;
	List<WebElement> allcarAddedSinceMenu;
	WebElement carReservedMenu;
	List<WebElement> allcarReservedMenu; 
	WebElement depositAmountMenu;
	List<WebElement> alldepositAmountMenu;
	WebElement annualMileageMenu;	
	List<WebElement> allAnnualMileageMenu;
	WebElement financePeriodMenu;
	List<WebElement> allFinancePeriodMenu;
	WebElement result;
	String resultText;
				/*Payment Search options*/
	
	
	public void CloseCreditPopUP () throws Exception {
		
		// close "can I get credit" PopUp
		
				closePopUp = getElementByClassName("close-widget");
				
				closePopUp.click();
		
		
	}
	
	public void selectMinPrice (String minPrice) throws Exception 
	
	{
		
		// locate Min Price drop down menu
		
		minPriceMenu = getElementById("searchbar-Min Price"); 
	
		// click and open the min price menu
		
		minPriceMenu.click();
		
		// select(click) min price value
		
		allMinPrice = getElementsByXPath("//ul[contains(@class,'np-inner-list')]//li");
		
		//System.out.println("The size of minPrice is " + allMinPrice.size());
		// iterate through min price list and select ur value
		
		for (WebElement minPriceOption:allMinPrice) {
				
			if(minPriceOption.getText().contains(minPrice)) {
				
				minPriceOption.click();
				break;
			}
		}
		
		
	}
	
	public void selectMaxPrice (String maxPrice) throws Exception 
	
	{
	
		
		
		// locate Min Price drop down menu
		
		maxPriceMenu = getElementById("searchbar-Max Price"); 
		
		// click and open the min price menu
		
		maxPriceMenu.click();
		
		// select(click) min price value
		
		allMaxPrice = getElementsByXPath("//ul[contains(@class,'np-inner-list')]//li");
		
		// iterate through min price list and select ur value
		
		for (WebElement maxPriceOption:allMaxPrice) {
				
			if(maxPriceOption.getText().contains(maxPrice)) {
				
				maxPriceOption.click();
				break;
			}
		}
		
		
	}

	
	public void minMonthlyPayment (String minMontlyPayment) throws Exception 
	
	{
	
		
		
		// locate Min Price drop down menu
		
		minMonthlyMenu = getElementById("searchbar-Monthly From"); 
		
		// click and open the min price menu
		
		minMonthlyMenu.click();
		
		// select(click) min price value
		
		allMinMontly = getElementsByXPath("//ul[contains(@class,'np-inner-list')]//li");
		
		// iterate through min price list and select ur value
		
		for (WebElement minMonthlyOption:allMinMontly) {
				
			if(minMonthlyOption.getText().contains(minMontlyPayment)) {
				
				minMonthlyOption.click();
				break;
			}
		}
		
		
	}
	
	public void maxMonthlyPayment (String maxMontlyPayment) throws Exception 
	
	{
	
		
		
		// locate Min Price drop down menu
		
		maxMonthlyMenu = getElementById("searchbar-Monthly To"); 
		
		// click and open the min price menu
		
		maxMonthlyMenu.click();
		
		// select(click) min price value
		
		 allMaxMontly = getElementsByXPath("//ul[contains(@class,'np-inner-list')]//li");
		
		// iterate through min price list and select ur value
		
		for (WebElement maxMonthlyOption:allMaxMontly) {
				
			if(maxMonthlyOption.getText().contains(maxMontlyPayment)) {
				
				maxMonthlyOption.click();
				break;
			}
		}
		
		
	}


					/* Car Specification options*/
	
	public void carAge (String carAge) throws Exception 
	
	{
	
		
		
		// locate Min Price drop down menu
		
		carAgeMenu = getElementById("searchbar-Age"); 
		
		// click and open the min price menu
		
		carAgeMenu.click();
		
		// select(click) min price value
		
		 allCarAge = getElementsByXPath("//ul[contains(@class,'np-inner-list')]//li");
		
		// iterate through min price list and select ur value
		
		for (WebElement carAgeOption:allCarAge) {
				
			if(carAgeOption.getText().contains(carAge)) {
				
				carAgeOption.click();
				break;
			}
		}
		
		
	}

	public void carMileage (String carMileage) throws Exception 
	
	{
	
		
		
		// locate Min Price drop down menu
		
		carMileageMenu = getElementById("searchbar-Mileage"); 
		
		// click and open the min price menu
		
		carMileageMenu.click();
		
		// select(click) min price value
		
		 allCarMileage = getElementsByXPath("//ul[contains(@class,'np-inner-list')]//li");
		
		// iterate through min price list and select ur value
		
		for (WebElement carMileageOption:allCarMileage) {
				
			if(carMileageOption.getText().contains(carMileage)) {
				
				carMileageOption.click();
				break;
			}
		}
		
		
	}
	
	public void carBodyType (String bodyType) throws Exception 
	
	{
	
		
		
		// locate Min Price drop down menu
		
		carBodyTypeMenu = getElementById("searchbar-Body Type"); 
		
		// click and open the min price menu
		
		carBodyTypeMenu.click();
		
		// select(click) min price value
		
		 allcarBodyType = getElementsByXPath("//ul[contains(@class,'np-inner-list')]//li");
		
		// iterate through min price list and select ur value
		
		for (WebElement carBodyTypeOption:allcarBodyType) {
				
			if(carBodyTypeOption.getText().contains(bodyType)) {
				
				carBodyTypeOption.click();
				break;
			}
		}
		
		
	}

	public void carFuelType (String fuelType) throws Exception 
	
	{
	
		
		
		// locate Min Price drop down menu
		
		carFuelTypeMenu = getElementById("searchbar-Fuel Type"); 
		
		// click and open the min price menu
		
		carFuelTypeMenu.click();
		
		// select(click) min price value
		
		 allcarFuelType = getElementsByXPath("//ul[contains(@class,'np-inner-list')]//li");
		
		// iterate through min price list and select ur value
		
		for (WebElement fuelTypeOption:allcarFuelType) {
				
			if(fuelTypeOption.getText().contains(fuelType)) {
				
				fuelTypeOption.click();
				break;
			}
		}
		
		
	}
	
	public void numberOfDoors (String doors) throws Exception 
	
	{
	
		
		
		// locate Min Price drop down menu
		
		numberOfDoorsMenu = getElementById("searchbar-No. of Doors"); 
		
		// click and open the min price menu
		
		numberOfDoorsMenu.click();
		
		// select(click) min price value
		
		 allnumberOfDoors = getElementsByXPath("//ul[contains(@class,'np-inner-list')]//li");
		
		// iterate through min price list and select ur value
		
		for (WebElement doorsOption:allnumberOfDoors) {
				
			if(doorsOption.getText().contains(doors)) {
				
				doorsOption.click();
				break;
			}
		}
		
		
	}
	
	public void numberOfSeats (String seats) throws Exception 
	
	{
	
		
		
		// locate Min Price drop down menu
		
		numberOfSeatsMenu = getElementById("searchbar-No. of Seats"); 
		
		// click and open the min price menu
		
		numberOfSeatsMenu.click();
		
		// select(click) min price value
		
		 allnumberOfSeats = getElementsByXPath("//ul[contains(@class,'np-inner-list')]//li");
		
		// iterate through min price list and select ur value
		
		for (WebElement seatsOption:allnumberOfSeats) {
				
			if(seatsOption.getText().contains(seats)) {
				
				seatsOption.click();
				break;
			}
		}
		
		
	}
	
	public void carColour (String colour) throws Exception 
	
	{
	
		
		
		// locate Min Price drop down menu
		
		carcolourMenu = getElementById("searchbar-Colour"); 
		
		// click and open the min price menu
		
		carcolourMenu.click();
		
		// select(click) min price value
		
		 allcarcolour = getElementsByXPath("//ul[contains(@class,'np-inner-list')]//li");
		
		// iterate through min price list and select ur value
		
		for (WebElement coloursOption: allcarcolour ) {
				
			if(coloursOption.getText().contains(colour)) {
				
				coloursOption.click();
				break;
			}
		}
		
		
	}
	
	public void carTransmissions (String transmission) throws Exception 
	
	{
	
		
		
		// locate Min Price drop down menu
		
		carTransmissionsMenu = getElementById("searchbar-Transmission"); 
		
		// click and open the min price menu
		
		carTransmissionsMenu.click();
		
		// select(click) min price value
		
		 allcarTransmissionsMenu = getElementsByXPath("//ul[contains(@class,'np-inner-list')]//li");
		
		// iterate through min price list and select ur value
		
		for (WebElement transmissionOption: allcarTransmissionsMenu ) {
				
			if(transmissionOption.getText().contains(transmission)) {
				
				transmissionOption.click();
				break;
			}
		}
		
		
	}
	
	public void carLocation (String location) throws Exception 
	
	{
	
		
		
		// locate Min Price drop down menu
		
		carLocationMenu = getElementById("searchbar-Location"); 
		
		// click and open the min price menu
		
		carLocationMenu.click();
		
		// select(click) min price value
		
		 allcarLocationMenu = getElementsByXPath("//ul[contains(@class,'np-inner-list')]//li");
		
		// iterate through min price list and select ur value
		
		for (WebElement locationOption: allcarLocationMenu ) {
				
			if(locationOption.getText().contains(location)) {
				
				locationOption.click();
				break;
			}
		}
		
		
	}
	
	public void carAddedSince (String since) throws Exception 
	
	{
	
		
		
		// locate Min Price drop down menu
		
		carAddedSinceMenu = getElementById("searchbar-Added Since"); 
		
		// click and open the min price menu
		
		carAddedSinceMenu.click();
		
		// select(click) min price value
		
		 allcarAddedSinceMenu = getElementsByXPath("//ul[contains(@class,'np-inner-list')]//li");
		
		// iterate through min price list and select ur value
		
		for (WebElement sinceOption: allcarAddedSinceMenu ) {
				
			if(sinceOption.getText().contains(since)) {
				
				sinceOption.click();
				break;
			}
		}
		
		
	}
	
	public void carReserved (String reserved) throws Exception 
	
	{
	
		
		
		// locate Min Price drop down menu
		
		carReservedMenu = getElementById("searchbar-Hide Reserved"); 
		
		// click and open the min price menu
		
		carReservedMenu.click();
		
		// select(click) min price value
		
		 allcarReservedMenu = getElementsByXPath("//ul[contains(@class,'np-inner-list')]//li");
		
		// iterate through min price list and select ur value
		
		for (WebElement reservedOption:  allcarReservedMenu ) {
				
			if(reservedOption.getText().contains(reserved)) {
				
				reservedOption.click();
				break;
			}
		}
		
		
	}
	
	
					/* Finance Options*/

	
	
	public void depositAmount (String amount) throws Exception 
	
	{
		// scroll up the page to view the webElement
		
		ScrollUp();
		
		Thread.sleep(2000);
		
		// locate Min Price drop down menu
		
		//depositAmountMenu = getElementByCssSelector("[class=\"np-field field-value has-value\"]"); 
		
		depositAmountMenu = getElementByXPath("//span[text()='£250']");
		
		
		javaScriptClick(depositAmountMenu);
		
		// click and open the min price menu
		
		//depositAmountMenu.click();
		
		//HoverOver(depositAmountMenu);
		
		// select(click) min price value
		
		alldepositAmountMenu = getElementsByXPath("//ul[contains(@class,'np-inner-list')]//li");
		
		// iterate through min price list and select ur value
		
		for (WebElement amountOption:  alldepositAmountMenu ) {
				
			if(amountOption.getText().contains(amount)) {
				
				javaScriptClick(amountOption);
				break;
			}
		}
		
		
	}
	
	public void annualMileage (String mileage) throws Exception 
	
	{
		
		// locate annual mileage element
		
		annualMileageMenu = getElementById("searchbar-Annual Mileage");
		
		// open the annual mileage drop down
		
		javaScriptClick(annualMileageMenu);
		
		
		allAnnualMileageMenu = getElementsByXPath("//ul[contains(@class,'np-inner-list')]//li");
		
		// iterate through min price list and select ur value
		
		for (WebElement mileageOption:  allAnnualMileageMenu ) {
				
			if(mileageOption.getText().contains(mileage)) {
				
				javaScriptClick(mileageOption);
				break;
			}
		}
		
		
	}
	
	public void financePeriod (String period) throws Exception 
	
	{
		
		// locate finance period element
		
		financePeriodMenu = getElementById("searchbar-Finance Period");
		
		// open the finance period drop down
		
		javaScriptClick(financePeriodMenu);
		
		
		allFinancePeriodMenu = getElementsByXPath("//ul[contains(@class,'np-inner-list')]//li");
		
		// iterate through min price list and select ur value
		
		for (WebElement periodOption:  allFinancePeriodMenu ) {
				
			if(periodOption.getText().contains(period)) {
				
				javaScriptClick(periodOption);
				break;
			}
		}
		
		
	}


	public void checkResult (String carName) throws Exception 
	
	{
		
		Thread.sleep(3000);
		 
		
		result = getElementByCssSelector("#results > div > div > div > div > div.vehicle-card-title > h2 > a");
		
		resultText = result.getText();
		
		//System.out.println(result.getText().contains(carName));
		verifyResult(resultText, carName);
		
		
		{
			
			
		}
		
		
		
		
	}












}
