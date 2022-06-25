package org.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class LoginPage extends baseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")
	private WebElement txtUserName;
	@FindBy(id = "password")
	private WebElement txtPassword;

	@FindBy(id = "login")
	private WebElement btnLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void login(String uName, String pass) {
		sendValue(getTxtUserName(), uName);
		sendValue(getTxtPassword(), pass);
		String attribute = getAttribute(getTxtPassword(), "value");
		System.out.println(attribute);
		SoftAssert s = new SoftAssert();
		s.assertEquals(attribute, "8220861943adak", "verify pass");
		s.assertTrue(true);
		click(btnLogin);
	
	}

}
