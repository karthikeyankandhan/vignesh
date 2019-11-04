package org.tcs.tes;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page001 extends baseClass

{

	
	public page001 ()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (id ="username")
	private WebElement txtusername;


	@FindBy (id= "password")
	private WebElement txtpassword;
	
	@FindBy ( xpath="//input[@class='login_button']")
	private List<WebElement>lstBtn;
	
	

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public List<WebElement> getLstBtn() {
		return lstBtn;
	}
	
	
	
	
	
	
	
}
