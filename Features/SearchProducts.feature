Feature: Dell app product tests
	
	Background:
		Given User launched dell site
	
	@Regression
	Scenario: Search a Laptop
		# Given User launched dell site
		Then User navigates to Laptop from home
		Then User verifies LaptopComputersPage
		
	@Regression	
	Scenario: Search a Desktop
		# Given User launched dell site
		Then User navigates to Desktops from home
		Then User verifies DestopsComputersPage
		
	@Smoke	
	Scenario Outline: Go to laptops and search for laptop type
		# Given User launched dell site
		Then User navigates to Laptop from home
		Then User verifies LaptopComputersPage
		Then User enters laptop type as "<laptoptype>" and verifies the searched page
		
		Examples:
		| laptoptype |
		|	Inspiron |
		|	XPS |
		