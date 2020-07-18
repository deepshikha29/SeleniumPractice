package siteOne;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Keywords {
	
	public void enter_URL(WebDriver driver,String TestData) throws IOException
	{
	driver.get(TestData);
	}
	//method for typing action – Keyword is ‘type’ 
	/*public void type(WebDriver driver, String ObjectName, String locatorType, String testdata) 
	{
	driver.findElement(this.getObject(ObjectName,locatorType)).sendKeys(testdata);
	}
	  
	//method for click action – Keyword is ‘click’ 
	public void click(WebDriver driver,String ObjectName, String locatorType) 
	{
	driver.findElement(this.getObject(ObjectName,locatorType)).click();
	}*/
	 
	}


