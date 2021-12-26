package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import TestBase.TestBase;

public class JavaScriptHelper extends TestBase{
	
	public void jsScrollToElement(WebElement ele) {
		JavascriptExecutor objJS = (JavascriptExecutor) driver;
		objJS.executeScript("arguments[0].scrollIntoView(true);",ele);
	}

}
