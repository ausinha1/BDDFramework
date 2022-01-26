package com.dellapp.stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
//comment 1
//comment 2
@RunWith(Cucumber.class) 
@CucumberOptions(features="Features",glue={"com.dellapp.stepdefinitions"},
plugin = { "pretty","html:target/cucumber-reports/cucumber.html", "json:target/cucumber-reports/cucumber.json"},
monochrome=true,
tags="@Smoke")
public class TestRunner {
	
}
