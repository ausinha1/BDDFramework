package com.dellapp.stepdefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Desktop;
import Pages.Home;
import Pages.Laptop;
import TestBase.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SearchProductsSteps extends TestBase{

	Home objHome;
	Laptop objLaptop;
	Desktop objDesktop;
	
	@Before
	public void setup() {
		initialise();
		objHome = new Home();
		objLaptop = new Laptop();
		objDesktop = new Desktop();
		
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	@Given("^User launched dell site$")
	public void user_launched_dell_site() throws IOException {
		driver.get(prop.getProperty("url"));
		
	}
	
	@Then("^User navigates to Laptop from home$")
	public void user_navigates_to_laptop_from_home() {
		 objHome.moveToLaptopForHome();
	}
	
	@Then("^User verifies LaptopComputersPage$")
	public void user_verifies_LaptopComputersPage() {
		 Assert.assertTrue("LaptopComputersPage is not displayed", objLaptop.verifyLaptopComputersPageIsDisplayed());
	}
	
	@Then("^User navigates to Desktops from home$")
	public void user_navigates_to_desktops_from_home() {
		 objHome.moveToDesktopsForHome();
	}
	
	@Then("^User verifies DestopsComputersPage$")
	public void user_verifies_DestopsComputersPage() {
		 Assert.assertTrue("DestopsComputersPage is not displayed",objDesktop.verifyDesktopComputersPageIsDisplayed());
	}
	
	



}
