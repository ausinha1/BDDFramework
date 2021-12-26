package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class Home extends TestBase{
	
	
	@FindBy(xpath="//span[text()='Products']")
	WebElement linkProducts;
	
	@FindBy(xpath="//li/a[text()='Laptops']")
	WebElement linkLaptops;
	
	@FindBy(xpath="//li/a[text()='Desktops & All-in-One PCs']")
	WebElement linkDesktops;
	
	@FindBy(xpath="//a[@href='//www.dell.com/en-uk/shop/scc/sc/laptops']")
	WebElement linkLaptopsForHome;
	
	@FindBy(xpath="//a[@href='//www.dell.com/en-uk/shop/scc/sc/desktops']")
	WebElement linkDesktopsForHome;
	
	@FindBy(xpath="//a[text()='Accept All']")
	WebElement buttonAcceptAll;
	
	
	
	
	
	public Home() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickAcceptAll() {
		buttonAcceptAll.click();
	}
	
	public void moveToLaptopForHome() {
		linkProducts.click();
		linkLaptops.click();
		linkLaptopsForHome.click();
	}
	
	public void moveToDesktopsForHome() {
		linkProducts.click();
		linkDesktops.click();
		linkDesktopsForHome.click();
	}
	
	

}
