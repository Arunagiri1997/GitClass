package org.hdemo;

import org.demo.baseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends baseClass{

	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id= "location")
	private WebElement loc;	
	@FindBy (id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement noOfRooms;
	@FindBy(id ="datepick_in")
	private WebElement dateIn;
	@FindBy(id ="datepick_out")
	private WebElement dateOut;
	@FindBy(id ="adult_room")
	private WebElement adult;	
	@FindBy(id ="child_room")
	private WebElement child;
	@FindBy(id ="Submit")
	private WebElement submit;
	public WebElement getLoc() {
		return loc;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNoOfRooms() {
		return noOfRooms;
	}
	public WebElement getDateIn() {
		return dateIn;
	}
	public WebElement getDateOut() {
		return dateOut;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSubmit() {
		return submit;
	}
	//searchPage Methods
	public void search(String Location,String hotel,String rType,String rooms,String dateIn,String dateOut,String adult,String ch) {
		selectByVisibleText(getLoc(), Location);
		selectByVisibleText(getHotel(), hotel);	
		selectByVisibleText(getRoomType(), rType);	
		selectByVisibleText(getNoOfRooms(), rooms);
		sendValue(getDateIn(), dateIn);
		sendValue(getDateOut(), dateOut);
		selectByVisibleText(getAdult(), adult);
		selectByVisibleText(getChild(), ch);
		click(submit);		   







	}

}	   




