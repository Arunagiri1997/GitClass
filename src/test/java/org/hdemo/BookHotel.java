package org.hdemo;

import org.demo.baseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends baseClass{
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="first_name")
	private WebElement fName;

	@FindBy (id="last_name")
	private WebElement lName;

	@FindBy (id="address")
	private WebElement address;


	@FindBy (id="cc_num")
	private WebElement creditNum;
	@FindBy (id="cc_type")
	private WebElement creditType;
	@FindBy (id="cc_exp_month")
	private WebElement expireDateMonth;

	@FindBy (id="cc_exp_year")
	private WebElement expireDateYear;
	@FindBy (id="cc_cvv")
	private WebElement ccvNum;
	@FindBy(id="book_now")
	private WebElement bookNow;
	public WebElement getfName() {
		return fName;
	}
	public WebElement getlName() {
		return lName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreditNum() {
		return creditNum;
	}
	public WebElement getCreditType() {
		return creditType;
	}
	public WebElement getExpireDateMonth() {
		return expireDateMonth;
	}
	public WebElement getExpireDateYear() {
		return expireDateYear;
	}
	public WebElement getCcvNum() {
		return ccvNum;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
	public void TC4(String namef,String namel,String ad,String cNum,String type,String month,String year,String cNumber) {

		sendValue(getfName(), namef);
		sendValue(getlName(), namel);
		sendValue(getAddress(), ad);
		sendValue(getCreditNum(), cNum);
		selectByVisibleText(getCreditType(), type);
		selectByVisibleText(getExpireDateMonth(), month);
		selectByVisibleText(getExpireDateYear(), year);
		sendValue(getCcvNum(), cNumber);

		click(bookNow);







	}














































}
