package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class Laptop extends TestBase{
	
	@FindBy(xpath="//h1[text()='Laptop Computers & 2-in-1 PCs']")
	WebElement labelLaptopComputers;
	

	public Laptop() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyLaptopComputersPageIsDisplayed() {
		return labelLaptopComputers.isDisplayed();
		
		
	}
	

}
