Feature: Dell app product tests
	
	@Regression
	Scenario: Search a Laptop
		Given User launched dell site
		Then User navigates to Laptop from home
		Then User verifies LaptopComputersPage
		
	@Smoke	
	Scenario: Search a Desktop
		Given User launched dell site
		Then User navigates to Desktops from home
		Then User verifies DestopsComputersPage