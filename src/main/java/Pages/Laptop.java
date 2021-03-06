package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;
import util.JavaScriptHelper;
import util.WaitHelper;

public class Laptop extends TestBase{
	
	JavaScriptHelper objJS = new JavaScriptHelper();
	WaitHelper objWait = new WaitHelper();
	
	@FindBy(xpath="//h1[text()='Laptop Computers & 2-in-1 PCs']")
	WebElement labelLaptopComputers;
	
	@FindBy(xpath="//a[@title='Inspiron']/preceding-sibling::input")
	WebElement checkBoxInspiron;
	
	@FindBy(xpath="//a[@title='XPS']/preceding-sibling::input")
	WebElement checkBoxXps;
	
	@FindBy(xpath="//h1/span[contains(text(),'Inspiron')]")
	WebElement pageheadingInspiron;
	
	@FindBy(xpath="//h1/span[contains(text(),'XPS')]")
	WebElement pageheadingXps;
	

	public Laptop() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyLaptopComputersPageIsDisplayed() {
		return labelLaptopComputers.isDisplayed();
	}
	
	public void clickInspironCheckbox() {
		objJS.jsScrollToElement(checkBoxInspiron);
		objWait.waitForSomeTime(2);
		checkBoxInspiron.click();
	}
	
	public void clickXpsCheckbox() {
		objJS.jsScrollToElement(checkBoxXps);
		objWait.waitForSomeTime(2);
		checkBoxXps.click();
	}
	
	public boolean verifyInspironPageIsDisplayed() {
		return pageheadingInspiron.isDisplayed();
	}
	
	public boolean verifyXpsPageIsDisplayed() {
		return pageheadingXps.isDisplayed();
	}
	

}
