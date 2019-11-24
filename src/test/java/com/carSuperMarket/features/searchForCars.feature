#Author: Mubarak
#Date: 9/09/19
Feature: Search for Cars
  		 In order to view different cars for sale
  		 As an car supermarket customer
  		 I want the ability to search for a car of my choice

  Scenario Outline: Search for different cars on Home page
    Given I navigate to carsupermarket home page
    And I click on Searchbar-make
    And I click on the make of the car as "<Make>"
    And I select the car model as "<Model>"
    And I select the trim as "<Trim>"
    And I click on SearchVehicles
    When I close can I get credit PopUp
    And I select the min price as "<MinPrice>"
    And I select the max price as "<MaxPrice>"
    And I select the min monthly payment as "<MinMonthlyPayment>"
    And I select the max monthly payment as "<MaxMonthlyPayment>"
    And I select the car age as "<VehicleAge>"
    And I select the mileage as "<Mileage>"
    And I select the body type as "<BodyType>"
    And I select the fuel type as "<FuelType>"
    And I select the number of doors as "<NumOfDoors>"
    And I select the number of seats as "<NumOfSeats>"
    And I select the car colour as "<carColours>"
    And I select the transmissions types as "<TransmissionsTypes>"
    And I select the car location as "<Locations>"
    And I select the added since as "<AddedSince>"
    And I select the ignore reservvation as "<IgnoreReservedCars>"
    And I select the deposit amount as "<CarDepositOption>"
    And I select the annual mileage as "<AnnualMileage>"
    And I select the finance period as "<FinancePeriod>"
    Then The search result for "<VerifyMake>" is displayed

    Examples: 
      | Make | Model    | Trim              | MinPrice | MaxPrice | MinMonthlyPayment | MaxMonthlyPayment | VehicleAge | Mileage      | BodyType       | FuelType | NumOfDoors | NumOfSeats | carColours | TransmissionsTypes | Locations | AddedSince | IgnoreReservedCars | CarDepositOption | AnnualMileage | FinancePeriod | VerifyMake   |
      | BMW  | 1 Series | M Sport Shadow Ed | £16,000  | £20,000  | £50               | £275              | Any Year   | Up to 30,000 | All Body Types | Petrol   |          5 |          5 | White      | Automatic          | Any       | Any        | No                 | £500             | 9,000 miles   | 48 months     | BMW 1 SERIES |
