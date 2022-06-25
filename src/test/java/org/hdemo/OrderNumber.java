package org.hdemo;

import org.demo.baseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderNumber extends baseClass {
	public OrderNumber() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="order_no")
	private WebElement oNr;
	public WebElement getoNr() {
		return oNr;
	}
public void TC4(String value) throws InterruptedException {
	Thread.sleep(5000);
String attribute = getAttribute(getoNr(), value);
System.out.println(attribute);

	
	

}
}