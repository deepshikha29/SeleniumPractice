package siteOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	
	private WebDriver driver;
	
	public Methods(){
		System.setProperty("webdriver.chrome.driver", "/home/deeps/Desktop/Selenium/ChromeDriver/chromedriver");
	    driver=new ChromeDriver();
	}
	
	void openbrowser(){
		
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		
	}	
	
	void inputName(){
//		CharSequence[] input = new String[];
		driver.findElement(By.name("name")).sendKeys("Deeps");
	}
	
}
