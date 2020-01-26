# Author Name: Mubarak 
# Date: 09/09/19
#
#
#Feature: Search for Vans
#				 In order to view different vans for sale
#				 As  car supermarket customer
#				 I want the ability to search for a van of my choice
#
#Scenario Outline: Search for Ford Ranger vans on  search for used vans 
#
#								Given I navigate to carsupermarket home page
#								And   I click on Vans link
#								When  I select the make of the van as "<Make>" 
#								And   I select the van model as "<Model>" 
#								And   I select the Van trim as "<Trim>" 
#								And   I select van deposit amount as "<CarDepositOption>" 
#								And   I select van annual mileage as "<AnnualMileage>" 
#								And   I select van finance period as "<FinancePeriod>" 
#								Then  The van search result for "<VanType>" is displayed
#								
#Examples:
#
#| Make| Model  | Trim   |CarDepositOption| AnnualMileage| FinancePeriod| VanType     | 							
#| Ford| Ranger | RANGER | £2,000         | 12,000       | 60 months    | FORD RANGER |								
#
#
#Scenario Outline: Search for different vans that are two years old on vans search page 
#
#								Given I navigate to carsupermarket home page
#								And   I click on Vans link
#								When  I select the van age as "<YearFrom>" 
#								Then  The vans search result "<VanAge>" is displayed
#								
#Examples:
#
#| YearFrom | VanAge            | 							
#| 2015     | 2 year(s) or less |		


