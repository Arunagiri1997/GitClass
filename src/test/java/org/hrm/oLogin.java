package org.hrm;

import org.demo.baseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class oLogin extends baseClass{
		 public oLogin() {
			 PageFactory.initElements(driver, this);
	}
	@FindBy(id="txtUsername")
	private WebElement uNmae;
	
	@FindBy(id="txtPassword")
	private WebElement pass;
	
	@FindBy(id="btnLogin")
	private WebElement btnlogin;

	public WebElement getuNmae() {
		return uNmae;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	public  void loginPage(String text,String password) {
		
	sendValue(getuNmae(), text);
	sendValue(getPass(), password);
	click(btnlogin);
	
		
		
		
	}
	
	
	
	
	
	
	
	

}
