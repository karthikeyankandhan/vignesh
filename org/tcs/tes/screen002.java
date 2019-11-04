package org.tcs.tes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class screen002 extends baseClass
{

	public screen002()
	{
		PageFactory.initElements(driver, this);
		
	}
	

	@FindBy(id ="location")
	private WebElement location;
	
	@FindBy (id= "hotels")
	private WebElement hotel;
	
	@FindBy (id ="room_type")
	private WebElement room_type;
	
}
