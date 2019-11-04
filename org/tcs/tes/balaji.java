package org.tcs.tes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class balaji extends baseClass 
{

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\pr soft\\eclipse-workspace\\karthikeyankandhan\\WindowHandling\\driver\\chromedriverVersion76.1.exe");
		
	   driver = getDriver();
		
		loadurl("https://adactin.com/HotelApp/index.php");
		
		page001 page = new page001();
		
		type(page.getTxtusername(), "karthikeyankandhan");
		type(page.getTxtpassword(), "123456789");
		btnclick(page.getLstBtn().get(0));
		
		
		
		
		
	}

}
