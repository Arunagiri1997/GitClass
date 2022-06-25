package org.hdemo;

import org.demo.baseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends baseClass {
	public SelectHotel() {
		
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement selectButton;
	
	@FindBy(id="continue")
	private WebElement continueButton;

	public WebElement getSelectButton() {
		return selectButton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}
	
public  void select() {
	click(selectButton);
	click(continueButton);
	
}	
	
	
	
	
	

}
