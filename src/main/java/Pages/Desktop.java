package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class Desktop extends TestBase {
	
	
	@FindBy(xpath="//a[text()='Inspiron Desktops']")
	WebElement labelInspironDesktops;
	
	public Desktop() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyDesktopComputersPageIsDisplayed() {
		return labelInspironDesktops.isDisplayed();
		
		
	}
}
