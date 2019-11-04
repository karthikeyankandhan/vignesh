package org.tcs.tes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {
	
	 static WebDriver driver;
	
	public static WebDriver getDriver()
	
	{

System.setProperty("webdriver.chrome.driver","C:\\Users\\pr soft\\eclipse-workspace\\karthikeyankandhan\\WindowHandling\\driver\\chromedriverVersion76.1.exe");
		
	 driver = new ChromeDriver();
		
		return driver;
		
	}
	
	public static void loadurl(String url)
	{
		driver.get(url);
	}
	
	public static void type( WebElement element, String name )

	{
		
		element.sendKeys(name);
		
	}
	
	public static void btnclick( WebElement element )
	
	{
		element.click();
	}

	
	
  }
	
