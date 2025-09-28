package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class SearchHotel extends BaseClass {
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement Location;
	
	@FindBy(id="hotels")
	private WebElement Hotels;
	
	@FindBy(id="room_type")
	private WebElement RoomType;
	
	@FindBy(id="room_nos")
	private WebElement NoofRooms;
	
	@FindBy(id="datepick_in")
	private WebElement CheckInDate;
	
	@FindBy(id="datepick_out")
	private WebElement CheckOutDate;
	
	@FindBy(id="adult_room")
	private WebElement AdultsPerRoom;
	
	@FindBy(id="child_room")
	private WebElement ChildPerRoom;
	
	@FindBy(id="Submit")
	private WebElement Search;
	
	@FindBy(id="Reset")
	private WebElement ResetBtn;
	
	
	public WebElement getLocation() {
		return Location;
	}
	public WebElement getHotels() {
		return Hotels;
	}
	public WebElement getRoomType() {
		return RoomType;
	}
	public WebElement getNoofRooms() {
		return NoofRooms;
	}
	public WebElement getCheckInDate() {
		return CheckInDate;
	}
	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}
	public WebElement getAdultsPerRoom() {
		return AdultsPerRoom;
	}
	public WebElement getChildPerRoom() {
		return ChildPerRoom;
	}
	public WebElement getSearch() {
		return Search;
	}
	public WebElement getResetBtn() {
		return ResetBtn;
	}
	
	
	
	
}
